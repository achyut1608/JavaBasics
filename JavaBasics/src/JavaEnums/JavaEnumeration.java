package JavaEnums;

public class JavaEnumeration {
	public static void main(String[]args) {
		
		Builders []builders = Builders.values();
		for(Builders builder:builders)
			System.out.println("Builder.Name : "+builder.toString()+"Values : "+builder.printing());
	}
}

enum Builders {
	PRESTIGE,SOBHA,DLF,GODREJ;
	
	int printing() {
		System.out.println("in get Name");
		int val1 = 10,val2 = 20,val3 = val1+val2;
		return val3;
	}
	
}