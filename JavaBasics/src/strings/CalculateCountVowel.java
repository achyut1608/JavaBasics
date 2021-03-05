package strings;

import java.util.Scanner;

public class CalculateCountVowel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		CalculateCountVowel count = new CalculateCountVowel();
		count.counting(string);
	}
	int vowel,consonant;
	void counting(String string) {
		for(char key:string.toCharArray()) {
		
			if(key=='a'||key=='e'||key=='i'||key=='o'||key=='u')
				++vowel;
			else
				++consonant;
		}
		
		System.out.println("vowel : "+vowel+ ",consonant : "+consonant);
		
		
	}
}