package arrays;

import java.util.Scanner;

public class Example2DArray {

	public static void main(String[] args) {
		
		int ar[][] = new int[3][3];
		getDataFromUser(ar);
		printArray(ar);
	}
	
	static void getDataFromUser(int[][]ar) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				ar[i][j]=scan.nextInt();
			}
		}
	}
	
	static void printArray(int[][]ar) {
		
		for(int i=0;i<ar.length;i++) {
			
			for(int element:ar[i])
				System.out.print(element+" ");
			
			System.out.println();
		}
		
	}

}
