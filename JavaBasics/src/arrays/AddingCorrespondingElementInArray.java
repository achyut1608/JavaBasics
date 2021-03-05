package arrays;

import java.util.Scanner;

public class AddingCorrespondingElementInArray {

	public static void main(String[] args) {
		int ar1[] = new int[5];
		int ar2[] = new int[5];
		int ar3[] = new int[5];
		
		getElementsFromUser(ar1,ar2);
		sumOfArrays(ar1, ar2, ar3);
	}
	
	static void getElementsFromUser(int[]ar1,int[]ar2) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<ar1.length;i++) {
			System.out.println("Enter data for ar1");
			ar1[i] = scan.nextInt();
		}
		
		for(int i=0;i<ar2.length;i++) {
			System.out.println("Enter data for ar2");
			ar2[i] = scan.nextInt();
		}
		
		
	}
	
	static void sumOfArrays(int[]ar1,int[]ar2,int[]ar3) {
		
		for(int i=0;i<ar1.length;i++) 
			ar3[i] = ar1[i]+ar2[i];
		
		for(int element:ar3)
			System.out.println(element);
	}

}
