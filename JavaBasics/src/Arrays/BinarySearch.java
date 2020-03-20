package Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50};
		System.out.println(binarySearch(ar, 0, ar.length-1, 10));
	}
	
	static int binarySearch(int[]ar,int firstElement,int lastElement,int keyElement) {
		
		if(lastElement>=firstElement) {
			int midElement = firstElement+(lastElement-firstElement)/2;
			System.out.println(midElement);
			if(ar[midElement]>=keyElement)
				return binarySearch(ar, firstElement, midElement-1, keyElement);
			else
				return binarySearch(ar, midElement+1, lastElement, keyElement);
		}
		
		return -1;
	}

}
