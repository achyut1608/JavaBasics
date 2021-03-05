package inner_class;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// normal Anonymous class 
		Person person = new Person() {
			void myFunction() {
				System.out.println("in anonymous Inner Class");
			}
		};
		
		person.myFunction();
		System.out.println(person);
		
		// anonymous abstract class
		
		InnserAbstractClass abstractClass = new InnserAbstractClass() {
			void eat() {
				System.out.println("inside abstract class abstract method");
			}
		};
		
		abstractClass.eat();
		
		// anonymous Interface
		myInnerInterface myInterface = new myInnerInterface() {
			
			@Override
			public void interfacefunction1() {
				// TODO Auto-generated method stub
				System.out.println("Inside interfaceFunction1");
			}
		};
		
		myInterface.interfacefunction1();
		myInterface.myInner();
		
	}

}
class Person {
	String name = "Achyut";
	int age=12;
	void myFunction() {}
	
	@Override
	public String toString() {
		return name +" "+ age;
	}
}

abstract class InnserAbstractClass {
	abstract void eat();
}

interface myInnerInterface{
	default void myInner() {
		System.out.println("inside interface default function");
	}
	
	void interfacefunction1();
}