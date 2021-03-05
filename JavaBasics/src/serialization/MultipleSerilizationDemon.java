package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class MultipleSerilizationDemon {

	public static void main(String[] args) {
		Serialize3 serial = new Serialize3();
		Deserilize3 deserial = new Deserilize3();
		
		
	}

}

class Dog implements Serializable {
	
	String name,type;

	Dog(){
		name = "Dog1";
		type = "DogType";
	}
	
	public String toString() {
		return name+","+type;
	}
	
}

class Cat implements Serializable {

	String name,type;
	
	Cat(){
		name = "Cat1";
		type = "CatType";
	}
	
	public String toString() {
		return name+","+type;
	}
}

class Serialize3 {
	
	Serialize3(){
		Dog writeDog = new Dog();
		Cat writeCat = new Cat();
		try {
			FileOutputStream fos = new FileOutputStream(new File("C://Users/Dev1/Desktop/multiple.abc"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(writeDog);
			oos.writeObject(writeCat);
			
			//there is another way to write multiple Object in file
			ArrayList<Object> al = new ArrayList<>();
			al.add(writeDog);
			al.add(writeCat);
			
			oos.writeObject(al);
			//finally closing the fileOutputStream,objectOutputStream
			fos.close();
			oos.close();
			
		} catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
}

class Deserilize3 {
	
	Deserilize3(){
		try {
			
			FileInputStream fis = new FileInputStream(new File("C://Users/Dev1/Desktop/multiple.abc"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Dog readDog = (Dog)ois.readObject();
			Cat readCat = (Cat)ois.readObject();
			
			System.out.println(readDog);
			System.out.println(readCat);
			
			// there is another way of reading object in serialization
			ArrayList<Object>al = new ArrayList<>();
			al = (ArrayList)ois.readObject();
			System.out.println(al);			
			
			fis.close();
			ois.close();
			
		} catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
}