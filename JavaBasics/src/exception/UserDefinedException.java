package exception;

import java.util.Scanner;

public class UserDefinedException {
	public static void main(String[]args)  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age to check valid age");
		int age = scan.nextInt();
		try {
			if(age<18)
				throw new AgeException("Too young");
			else
				System.out.println("Valid user");
		} catch(AgeException a) {
			a.printStackTrace();
		}
	}		
}

class AgeException extends Exception {
	AgeException(String message){
		super(message);
	}
}
