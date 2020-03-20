package OOPS;
/**
 * 
 * @author Dev1
 *	Demo of Encapsulation 
 */
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		ClassDemo demo = new ClassDemo();
		demo.setId(1);
		demo.setName("Achyut Thaker");
		demo.setEmail("achyut1608@gmail.com");
		demo.setContactNo(9925948428L);
		demo.setAddress("Dwarka");
		
		System.out.println(demo);
		
	}

}

class ClassDemo {
	
	private int id;
	private String name,email,address;
	private long contactNo;
	
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
	public String toString() {
		return id+","+name+","+email+","+contactNo+","+address;
	}
}
