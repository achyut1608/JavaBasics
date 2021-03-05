package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int []ar = new int[5];
		
		getDataFromUser(ar);
		bubbleSort(ar);
		print(ar);
	}
	
	static void getDataFromUser(int[] ar) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<ar.length;i++)
			ar[i] = scan.nextInt();
	}
	
	static void bubbleSort(int[]ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
	}
	
	static void print(int []ar) {
		for(int element:ar)
			System.out.println(element);
	}

}
