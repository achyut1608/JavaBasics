package strings;

import java.util.HashMap;
import java.util.Scanner;

public class CheckStringHasUniqueCharacter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String check = scan.nextLine();
		CheckStringHasUniqueCharacter uniqueCharacter = new CheckStringHasUniqueCharacter();
		System.out.println(uniqueCharacter.isUniqueCharacter(check));
		System.out.println(uniqueCharacter.checkUniqueCharacterUsingMap(check));
		
	}
	

	boolean isUniqueCharacter(String str) {
		boolean result = false;
		for(char key:str.toCharArray()) {
			if(str.indexOf(key)==str.lastIndexOf(key))
				result =  true;
			else {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	boolean checkUniqueCharacterUsingMap(String str) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		for(Character key:str.toCharArray()) {
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
				return false;
			}else
				map.put(key,1);
			
		}
		
		return true;
	}
}
