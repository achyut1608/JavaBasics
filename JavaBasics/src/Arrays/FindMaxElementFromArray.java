package Arrays;

import java.util.Scanner;

public class FindMaxElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar= new int[5];
		ar = getElementsFromUser(ar); 
		System.out.println(findMaxElement(ar));
	}
	
	static int[] getElementsFromUser(int []ar) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<ar.length;i++) 
			ar[i] = scan.nextInt();
		
		return ar;
	}
	
	static int findMaxElement(int []ar) {
		
		int max=0;
		
		for(int element:ar) {
			if(max<element)
				max = element;
		}
		
		return max;
	}

}
