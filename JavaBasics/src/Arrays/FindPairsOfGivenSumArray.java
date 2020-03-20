package Arrays;

import java.util.Scanner;

public class FindPairsOfGivenSumArray {

	public static void main(String[] args) {
		int [] numbers = new int[5];
		int sum = 20;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<numbers.length;i++)
			numbers[i] = scan.nextInt();
		
		for(int i=0;i<numbers.length-1;i++) {
			int first = numbers[i];
			int second = numbers[i+1];
			
			if((first+second)==sum)
				System.out.println("First : " + first + " + Second : " + second +" = sum"+sum);
		
		}
	}

}
