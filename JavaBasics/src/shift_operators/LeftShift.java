package shift_operators;

public class LeftShift {
	/**
	 * 
	 * @param args
	 * first it will convert decimal to binary then it will shift to the left side 
	 * left shifting an integer “x” with an integer “y” (x<<y) is equivalent to multiplying x with 2^y (2 raise to power y).
	 * Notes: 
	 * 1). this will work with both positive and negative numbers (5<<1)=10,(5<<4)=80
	 * 2). but shifting negative bit will give undefined answer like (5<<-1) = some garbage value,(5<<-4) = some garbage value
	 * 3).for 0 it will remain 0
	 * 4). if you give more than 31 bit then will it will modulus by 32 if we give 0,32,64,then it will same number which we have given   
	 * e.g. 
	 * 	num1 = 5;(0101)
	 *  now we performing 2 bit left shift so the o/p would be 
	 *  1010(10) -> 1Bit Shifting (5*(2^1)) =(5*2) =  10
	 *  10100(20) ->2Bit shifting (5*(2^2)) = (5*4) = 20
	 *  2147483648->-1Bit shifting 
	 *  
	 *   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		System.out.println(num1<<0);
	}

}
