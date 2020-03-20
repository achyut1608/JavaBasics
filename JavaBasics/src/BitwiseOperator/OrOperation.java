package BitwiseOperator;

public class OrOperation {
	/**Bitwise Or Operator 
	 *	this kind of operator convert decimal number to binary
	 *	number then it will do and operation on it
	 *  like int num1 = 2,int num2 = 3;
	 *  binary on 2 in 10 and and binary of 3 is 11 so the output should be 3
	 *  1). num1 = 10(2)
	 *      num2 = 11(3)
	 *      o/p  = 11(3)
	 *  2). num1 = 1234
	 *      num2 = 7894
	 *      o/p  = 7894
	 *  (Performing bitwise AND operation)
	 **/ 
	public static void main(String[]args) {
		int num1 = 1234,num2 = 7894;		
		System.out.println(num1|num2);
	}
}
