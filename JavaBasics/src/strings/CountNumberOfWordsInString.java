package strings;

import java.util.Scanner;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to count number of words in Strings");
		String string = scan.nextLine();
		System.out.println(countNumberOfWords(string));
	}
	
	static int countNumberOfWords(String string) {
		String[] count = string.split(" ");
		return count.length;
	}

}
