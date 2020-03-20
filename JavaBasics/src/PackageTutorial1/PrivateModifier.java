package PackageTutorial1;

/**
 * 
 *  @author Dev1
 *	in private modifier you can not access outside the class you have declare 
 */

public class PrivateModifier {
	
	private int myVariable = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privateModifierDemon demo = new privateModifierDemon();
		demo.myMethod();
		//below line will give compilation error because you cannot access outside class 
		//System.out.println("demo.myVar);
		
	}

}

class privateModifierDemon{
	private int myVar = 10;
	
	void myMethod() {
		System.out.println("inside the privateModifierDemon::myVar");
	}
}