package Arrays;

public class FindSmallerAndLargerNumberInArray {

	public static void main(String[] args) {
		
		int ar [] = new int[] {23,54,11,65,33};
		int smaller=ar[0],larger=ar[0];
		for(int element:ar) {
			
			if(smaller>element)
				smaller = element;
			else if(larger<element)
				larger = element;
			
		}
		
		System.out.println("Smaller : " + smaller + " larger : " + larger);
	}

}
