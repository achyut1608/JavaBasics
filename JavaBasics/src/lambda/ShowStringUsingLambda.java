package lambda;

public class ShowStringUsingLambda {
	public static void main(String[]args) {
		Lambda1 l1 =  ()-> {
			
			System.out.println("inside the interface show string method");
		};
		
		l1.showString();
		
	}
}

interface Lambda1 {
	
	public void showString();
}
