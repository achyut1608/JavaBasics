package lambda;

public class SingleParameter {
	public static void main(String[]args) {
		SingleParameterLambdaParameter splp = (num)->{
			return num*5;
			
		};
		
		System.out.println(splp.returnSingleParameter(100));
	}
}

interface SingleParameterLambdaParameter{
	
	int returnSingleParameter(int num1);
	
}
