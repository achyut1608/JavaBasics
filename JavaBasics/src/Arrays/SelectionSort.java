package Arrays;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int ar[] = new int[5];
		getUserData(ar);
		selection(ar);
		print(ar);
	}
	
	static void getUserData(int[]ar) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<ar.length;i++) 
			ar[i] = scan.nextInt();
		
	}
	
	static void selection(int[]ar) {
		for(int i=0;i<ar.length;i++) {
			int select = i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[select]>ar[j])
					select = j;
			}
			int temp = ar[select];
			ar[select] = ar[i];
			ar[i] = temp;
		}
	}
	
	static void print(int[]ar) {
		for(int element:ar)
			System.out.println(element);
	}

}
