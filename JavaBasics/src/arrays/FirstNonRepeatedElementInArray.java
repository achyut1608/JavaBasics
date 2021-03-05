package arrays;

import java.util.HashMap;

public class FirstNonRepeatedElementInArray {

	public static void main(String[] args) {
		int ar[] = {23,56,34,23,34};
		
		System.out.println(firstNonRepeating(ar, ar.length));
		firstNonRepeating(ar);
	}

	private static int firstNonRepeating(int[] ar, int length) {
		for(int i=0;i<ar.length;i++) {
			int j;
			for(j=0;j<ar.length;j++)
				if(i!=j&&ar[i]==ar[j])
					break;
				if(j==ar.length)
					return ar[i];
		}
		return -1;
	}
	
	static void firstNonRepeating(int []ar) {
		HashMap<Integer,Integer>map = new HashMap<>();
		for(int i=0;i<ar.length;i++) {
			if(map.containsKey(ar[i]))
				map.put(ar[i], map.get(ar[i])+1);
			else
				map.put(ar[i],1);
		}
		
		for(int i=0;i<ar.length;i++) {
			if(map.get(ar[i])==1) {
				System.out.println(ar[i]);
				break;
			}
		}
	}

}
