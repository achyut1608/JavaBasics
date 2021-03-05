package arrays;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar = new int[5];
		getDataFromUser(ar);
		insertionSort(ar);
		print(ar);
	}

	private static void getDataFromUser(int[] ar) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<ar.length;i++)
			ar[i] = scan.nextInt();
	}

	private static void insertionSort(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			int key = ar[i];
			int j = i-1;
			while((j>-1)&&(ar[j]>key)) {
				ar[j+1] = ar[j];
				j--;
			}
			ar[j+1] = key;
		}
		
	}
	
	private static void print(int[] ar) {
		// TODO Auto-generated method stub
		for(int element:ar)
			System.out.println(element);
	}

}
