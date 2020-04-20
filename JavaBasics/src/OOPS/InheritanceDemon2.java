package OOPS;
/**
 * 
 * @author Achyut
 * here we can't access like subclass method 'MyFunction' from parent class
 * 	SuperClass superClass  = new SubClass();
 * superClass.myFunction();
 */
public class InheritanceDemon2 {
	public static void main(String[]args) {
		SubClass superClass = new SubClass();
		superClass.myFunction();
	}
}

class SuperClass {
	int var = 10;
	public void display() {
		System.out.println("in super class function");
	}
}

class SubClass extends SuperClass {
	int var = 20;
	public void display() {
		System.out.println("in sub class display function");
	}
	
	void myFunction() {
		
		super.display();
		System.out.println("super.var : " + super.var);
		display();
		System.out.println("this.var : " + var);
	
	}
}