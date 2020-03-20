package InnerClass;

public class LocalInnerClass {
	
	public static void main(String[]args) {
		LocalInnerClass local = new LocalInnerClass();
		InnerClass inner = local.new InnerClass();
		inner.function1();
		System.out.println("inner class instance variable:  "+inner.num1);
	}
	class InnerClass{
		int num1 =10;
		void function1() {
			System.out.println("in innerclass");
		}
	}
}
