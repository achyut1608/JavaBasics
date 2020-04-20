package OOPS;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20,y = 10;
		MyCalculator my = new MyCalculator();
		my.addition(x,y);
		my.subtraction(x, y);
		my.multiply(x, y);
		my.division(x, y);
		my.modulus(x, y);
	}

}

class Calculator {
	public void addition(int x,int y) {
		System.out.println("addition : " + (x+y));
	}
	
	public void subtraction(int x,int y) {
		System.out.println("Substraction : "+(x-y));
	}
	
	public void multiply(int x,int y) {
		System.out.println("multiplication : " + (x*y));
		
	}
}

class MyCalculator extends Calculator {
	public void division(int x,int y) {
		System.out.println("Division : "+(x/y));
	}
	
	public void modulus(int x,int y) {
		System.out.println("Modulus : " + (x%y));
	}
}