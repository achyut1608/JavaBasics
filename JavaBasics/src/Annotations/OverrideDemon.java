package Annotations;


/**
 * 
 * @author Achyut
 * if we override the method with same but in case if we made mistake to declare the method then it will give compilation error
 */

public class OverrideDemon {
	public static void main(String[]args) {
		DB_Driver driver = new New_DB_Driver();
		driver.typeOfDriver();
	}
}

class DB_Driver{
	void typeOfDriver() {
		System.out.println("Type-1 Driver Selecting"); 	
	}
}

class New_DB_Driver extends DB_Driver {
	@Override
	void typeOfDriver() {
		System.out.println("Type 4 Driver Selecting");
	}
}

