package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedCharacterInString {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String to get first Not repeated character : ");
		String string = scan.nextLine();
		System.out.println("First non repeated character is : " + getFirstNonRepeatedCharacter(string));
	}
	
	static char getFirstNonRepeatedCharacter(String string) {
		char first = 0;
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<string.length();i++) {
			
			char key =  string.charAt(i);
			if(map.containsKey(string.charAt(i)))
				map.put(key, map.get(key)+1);
			else
				map.put(key, 1);
		}
		
		for(int i=0;i<string.length();i++) {
			char key = string.charAt(i);
			if(map.get(key)==1) {
				if(key!=' ') {
					first = key;
					break;
				}
			}
			
				
		}
		
		return first;
	}
}
