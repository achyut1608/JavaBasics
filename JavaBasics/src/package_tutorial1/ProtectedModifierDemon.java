package package_tutorial1;
/**
 * 
 * 
 * @author Dev1
 *	Protected type modifier can access in same package and
 *	subclass in other packages like
 *
 *	package package1
 *	class defineProtectedClass { int myClass = 10;}
 *
 *	package package2
 *	class accessJavaClass extends defineProtectedClass{static void mymethod(){System.out.println(myClass);}
 *	public static void main(String[]args){myMethod();}
 *
 *	but we cannot access otherwise in other package
 *}
 *
 */
public class ProtectedModifierDemon {
	static protected int myProtectedVariable = 10;
	
	protected void myProtectedMethod() {
		System.out.println("inside my Protected method");
	}
}
