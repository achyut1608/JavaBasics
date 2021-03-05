package inner_class;

public class InFunctionInnerClass {

	public static void main(String[] args) {
		
		InFunctionInnerClass innerClass = new InFunctionInnerClass();
		innerClass.innerClassFunction();
		
	}
	
	void innerClassFunction() {
		final int var = 10;
		class MyInnerClass {
			void innerFunction() {
				System.out.println("My Inner Class: "+ var);
			}
		}
		
		MyInnerClass inner = new MyInnerClass();
		inner.innerFunction();
	}

}
