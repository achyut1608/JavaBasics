package shift_operators;

public class RightShift {
	/**
	 * 
	 * @param args
	 * 
	 * 
	 * 1). Right shifting (x>>y) is equivalent to dividing x with 2^y.
	 * 2). if it is negative shift then it will be 0
	 * 3). if it is more than 32 then it will modulus by 32
	 * 4). if num1 = 0 remain 0
	 * 
	 */
	public static void main(String[] args) {
		
		int num1 = 0;
		System.out.println(num1>>35);
		
	}

}
