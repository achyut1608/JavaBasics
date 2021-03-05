package arrays;

import java.util.Scanner;

public class PrintOfSumOfAny10Numbers {

	public static void main(String[] args) {
		int [] ar = null;
		ar = getNumbersFromUser(ar);
		System.out.println("total : "+sumOfArrayElements(ar));
	}
	
	static int[] getNumbersFromUser(int []ar) {
		ar = new int[10];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Enter data :");
			ar[i] = scan.nextInt();
		}
		
		return ar;
	}
	
	static int sumOfArrayElements(int[] ar) {
		int total=0;
		
		for(int element:ar) 
			total+=element;
		
		return total;
	}
}
