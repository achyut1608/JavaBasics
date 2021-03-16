package lambda;

public class NoParameterLambdaFunction {
	public static void main(String[]args) {
		Sayable s = ()->{
				System.out.println("This is no parameter in function");
		};
		
		s.printString();
	}
}

interface Sayable {
	void printString();
}
