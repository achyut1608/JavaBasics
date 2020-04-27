package JavaEnums;

public class AccessingEnums {
	
	public enum level {LOW,MEDIUM,HIGH};
	
	public static void main(String[]args) {
		//accessing one enum elements 
		level winterLevel = level.MEDIUM;
		System.out.println(winterLevel);
		
		System.out.println("Accessing all elements....");
		//accessing all enum elements
		for(level elem : level.values())
			System.out.println(elem);
		
		//getting the index of enum element
		System.out.println("getting index of enum elements of 'HIGH....'");
		System.out.println(level.HIGH.ordinal());

	}
}
