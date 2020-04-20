package Strings;

import java.util.Scanner;

public class RemoveWhiteSpaceFromString {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		RemoveWhiteSpaceFromString remove = new RemoveWhiteSpaceFromString();
		remove.removeWhiteSpace(str);
	}
	
	void removeWhiteSpace(String string){
		/*for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ')
				System.out.print(string.charAt(i));
		}
		*/
		for(char ch:string.toCharArray())
			if(ch != ' ')
				System.out.print(ch);
		
	}
}
