package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemon  {
	
	public static void main(String[]args) {
		SerializationDemon demon = new SerializationDemon();
		Serialize1 serial = new Serialize1();
		Deserialize1 deserialize = new Deserialize1();
		
	}	
}

class SerializationTest1 implements Serializable {
	int id;
	String name,address,email;
	long contactNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	@Override
	public String toString() {
		return id+","+name+","+email+","+contactNo+","+address;
	}
	
}

class Serialize1 {
	Serialize1(){
		
		SerializationTest1 test = new SerializationTest1();
		test.id = 1;
		test.name="Achyut Thaker";
		test.email="achyut1608@gmail.com";
		test.contactNo=9925948428L;
		test.address = "dwarka";
		try {
			FileOutputStream fis = new FileOutputStream("c://Users/Dev1/Desktop/abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(test);
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
}

class Deserialize1 {
	
	public Deserialize1() {
		SerializationTest1 test;
		try {
			FileInputStream fis = new FileInputStream(new File("c://Users/Dev1/Desktop/abc.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			test = (SerializationTest1)ois.readObject();
			System.out.println(test);
		}catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
}