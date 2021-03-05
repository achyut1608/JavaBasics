package arrays;

import java.util.BitSet;

public class FindingMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDetails();
	}
	
	static void findDetails() {
		int totalCount = 10,missingCount=0,missingNumbers=0;
		int ar[] = new int[] {6};
		missingCount = totalCount-ar.length;
		BitSet bitSet = new BitSet(10);
		
		for(int element:ar)
			bitSet.set(element-1);
		
		for(int i=0;i<missingCount;i++) {
			missingNumbers = bitSet.nextClearBit(missingNumbers);
			System.out.println(++missingNumbers);
		}
		
			
	}

}
