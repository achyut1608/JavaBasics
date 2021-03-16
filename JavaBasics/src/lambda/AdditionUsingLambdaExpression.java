package lambda;

public class AdditionUsingLambdaExpression {
	public static void main(String[]args) {
		DualParameter add = (num1,num2) ->{
			return num1 + num2;
		};
		
		add.defaultMethod();
		System.out.println(add.additionOfTwoParameter(10, 15));
	}
}

interface DualParameter {
	
	public default void defaultMethod() {
		System.out.println("This is defaul method of interface");
	}
	public int additionOfTwoParameter(int num1,int num2);
	
}
