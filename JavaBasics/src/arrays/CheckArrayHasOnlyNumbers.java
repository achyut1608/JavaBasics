package arrays;

import java.util.Scanner;

public class CheckArrayHasOnlyNumbers {

	public static void main(String[] args) {
		String[] strAr = new String[5];
		Scanner scan = new Scanner(System.in);
		boolean isNumber = true;
		
		for(int i=0;i<strAr.length;i++) {
			strAr[i]=scan.next();
		}
		
		for(String element:strAr) {
			
			try {
				double num = Double.parseDouble(element);
			} catch(NumberFormatException nfe) {
				nfe.printStackTrace();
				isNumber = false;
			}
			
			if(isNumber)
				System.out.println("array contains number");
		
		}	
	}

}
