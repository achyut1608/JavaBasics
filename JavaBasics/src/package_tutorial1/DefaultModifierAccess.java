package package_tutorial1;

public class DefaultModifierAccess {
	public static void main(String[]args) {
		
		AccessClass access = new AccessClass();
		access.defaultModifierMethod();
		System.out.println(access.myVar);
		
		DefaultModifierDemon demo = new DefaultModifierDemon();
		demo.defaultModifierMethod();
		System.out.println("accessing myVar : " + demo.myVar);
		
	}
}

class AccessClass extends DefaultModifierDemon {
	
}
