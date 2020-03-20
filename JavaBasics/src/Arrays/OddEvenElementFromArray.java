package Arrays;

import java.util.Scanner;

public class OddEvenElementFromArray {
	
	public static void main(String[]args) {
		int [] ar = new int[5];
		int oddCount=0,evenCount=0;
		getUserData(ar);
		getCount(ar,oddCount,evenCount);
		
		
	}
	static void getUserData(int[]ar) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<ar.length;i++)
			ar[i] = scan.nextInt();
		
	}
	
	static void getCount(int[]ar,int oddCount,int evenCount) {
		for(int element:ar) {
			if(element%2==0)
				evenCount++;
			else
				oddCount++;
		}
		
		System.out.println("OddCount : " + oddCount+ " evenCount : " + evenCount);
	}
	
}
