package strings;

import java.util.Scanner;

public class CalculateChatacterOfString {
	public static void main(String[]artgs) {
		Scanner scan = new Scanner(System.in);
		String length = scan.nextLine();
		CalculateChatacterOfString calculateOfString = new CalculateChatacterOfString();
		calculateOfString.calculateRecursive(length);
	}
	int count=0;
	void calculateRecursive(String string) {
		for(int i=0;i<string.length();i++) {
			++count;
		}
		System.out.println("Length of the String : " + count);
	}
}
