package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class FindMultipleDuplicateElementsFromArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] ar = new int[5];
		
		for(int i=0;i<ar.length;i++)
			ar[i] = scan.nextInt();
		
		HashMap<Integer,Integer>map = new HashMap<Integer, Integer>();
		
		int repeated = -1;
		int nonRepeated = -1;
		
		for(int i=0;i<ar.length;i++) {
			if(map.containsKey(ar[i])) {
				if(repeated==-1)
					repeated = ar[i];		
							
				map.put(ar[i], map.get(ar[i]+1));
			} else {
				
				map.put(ar[i],1);
				
			}
		}
		
			
		if(repeated!=-1)
			System.out.println("first repeated element : "+repeated);
		
		
	}

}
