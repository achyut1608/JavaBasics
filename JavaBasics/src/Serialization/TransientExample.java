package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientExample {
	
	public static void main(String[]args) {
		
		TransientExample example = new TransientExample();
		serialize2 serial = new serialize2();
		Deserilize2 deserilize = new Deserilize2();
		
	}	
}

class SerializationTest2 implements Serializable  {
	
	int id;
	transient String name,email,address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	@Override
	public String toString(){
		return id+","+name+","+email+","+contactNo+","+address;
	}
	
}

class serialize2 {
	public serialize2() {
		SerializationTest2 test = new SerializationTest2();
		test.setId(1);
		test.setName("Achyut");
		test.setEmail("achyut1608@gmail.com");
		test.setContactNo(9925948428L);
		test.setAddress("Dwarka");
		try {
		FileOutputStream fos = new FileOutputStream(new File("c://Users/Dev1/Desktop/abc.ser"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(test);
		} catch(FileNotFoundException fnf) {fnf.printStackTrace();}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}

class Deserilize2 {
	public Deserilize2() {
		SerializationTest2 test;
		try {
			FileInputStream fis = new FileInputStream(new File("C://Users/Dev1/Desktop/abc.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			test = (SerializationTest2)ois.readObject();
			System.out.println(test);
		} catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
