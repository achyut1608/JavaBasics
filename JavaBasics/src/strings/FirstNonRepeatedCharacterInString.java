package strings;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedCharacterInString {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		FirstNonRepeatedCharacterInString firstNonRepeatCharacter = new FirstNonRepeatedCharacterInString();
		firstNonRepeatCharacter.findNonRepeatCharacter(str);
	}
	
	void findNonRepeatCharacter(String string) {
		HashMap<Character,Integer>map = new HashMap<Character, Integer>();
		for(Character key:string.toCharArray()) {
			if(map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key,1);
				
		}
		
		for(Character key:string.toCharArray())
			if(key != ' ') {
				if(map.get(key)==1) {
					System.out.println("First Non repeated character is : "+ key);
					break;
				}
			}
	}
}
