package Strings;

import java.util.Scanner;

public class CheckStringContainsUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to check unique chatacter : ");
		String string = scan.nextLine();
		System.out.println("does String contains unique character : " + checkUniqueCharacter(string));
	}
	
	static boolean checkUniqueCharacter(String string) {
		boolean isUnique = false;
		
		for(char key : string.toCharArray()){
	        if(key!=' ') {
	        	
				if(string.indexOf(key) == string.lastIndexOf(key))
		            isUnique = true;
		         else 
		        	return false;
		        
	        }
	    }
		return isUnique;
	}
}
