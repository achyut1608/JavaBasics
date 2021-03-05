package strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to reverse");
		String toReverse = scan.nextLine();
		System.out.println("printing Reverse String using iterative : " + usingIterative(toReverse));
		System.out.println("Printing Reverse String using Recursing : "+ usingRecursion(toReverse, toReverse.length()-1));
	}
	
	static StringBuilder reverse = new StringBuilder("");
	static String usingRecursion(String toReverse,int length) {
		if(length>=0) {
			reverse.append(toReverse.charAt(length));
			usingRecursion(toReverse, length-1);
		} 
		
		return reverse.toString();
	}
	
	static String usingIterative(String toReverse) {
		StringBuilder reverse=new StringBuilder("");
		
		for(int i=toReverse.length()-1;i>=0;i--) 
			reverse.append(toReverse.charAt(i));
		
		
		return reverse.toString();
	}
}
