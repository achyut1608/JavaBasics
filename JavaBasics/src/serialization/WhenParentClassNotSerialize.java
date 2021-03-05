package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* in Serialization and parent class is not serialize and child class is Serialize than 
//if child class access instance variable then it will serialize perfectly but if we try
//to store the parent class object then it will give exception like classNotSerializeException
// like 
class parent {
 	int a
 }
 
 class child extends parent implements Serialization {
 	int a=10; // this will store in the file perfectly
 	parent p = new parent(); // this will give exception like class not serialize exception 
 }
 


*/
public class WhenParentClassNotSerialize {
	public static void main(String[]args) {
		TestChild test = new TestChild();
		TestParent parent = new TestParent();
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("abc.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(test);
			
			
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			TestChild child = (TestChild)ois.readObject();
			TestParent parent1 = (TestParent)ois.readObject();
			System.out.println("after deserialization");
			System.out.println(child.i);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
class TestParent {
	int i;
	TestParent(){
		i=10;
	}
}

class TestChild extends TestParent implements Serializable {
	TestChild(){
		i=50;
	}
}