package Strings;

import java.util.Scanner;

public class RemoveWhiteSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to remove White Space");
		String string = scan.nextLine();
		int length = string.length();
		System.out.println("Length : " + length);
		System.out.println("String after removing white space : " + removeWhiteSpaceInStringUsingRecursion(string,0));
		System.out.println("String after removing white space using iterative : " + removeWhiteSpaceInStringUsingIterative(string));
		}
	
	static String removeWhiteSpaceInStringUsingIterative(String string) {
		StringBuilder builder = new StringBuilder("");
		for(char key:string.toCharArray()) {
			if(key != ' ')
				builder.append(key);
			
		}
		
		return builder.toString();
	}
	
	static StringBuilder builder = new StringBuilder("");
	
	static int removeWhiteSpaceInStringUsingRecursion(String string,int count) {
		if(string.length()>count) {
			System.out.println("count : " + count);
			removeWhiteSpaceInStringUsingRecursion(string, count++);
		}
		return count;
	}
}