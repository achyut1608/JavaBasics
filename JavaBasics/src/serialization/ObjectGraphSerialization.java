package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectGraphSerialization {

	public static void main(String[] args) {
		Serialize serial = new Serialize();
		Deserialize deserialize = new Deserialize();

	}

}

class Dog3 implements Serializable {
	
	String name,type;
	Cat3 cat3;
	Dog3(){
		name="Dog2";
		type="DogType";
		cat3 = new Cat3();
	}
	
	public String toString() {
		return name+","+type;
	}
}

class Cat3  implements Serializable {
	
	String name,type;
	Rat3 rat3;
	Cat3(){
		name="Cat2";
		type="CatType";
		rat3 = new Rat3();
	}
	
	public String toString() {
		return name+","+type;
	}
}

class Rat3  implements Serializable {
	
	String name,type;
	
	Rat3(){
		name="Rat3";
		type="RatType";
	}
	
	public String toString() {
		return name+","+type;
	}
}

class Serialize {
	
	Serialize(){
		try {
			FileOutputStream fis = new FileOutputStream(new File("C://Users/Dev1/Desktop/abc.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			
			Dog3 dog3 = new Dog3();
			oos.writeObject(dog3);
			
		} catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
}

class Deserialize {
	
	Deserialize(){
		try {
			
			FileInputStream fis = new FileInputStream(new File("C://Users/Dev1/Desktop/abc.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog3 dog3 = (Dog3)ois.readObject();
			
			System.out.println(dog3.cat3.rat3);
			System.out.println(dog3.cat3);
			System.out.println(dog3);
			
		} catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
}