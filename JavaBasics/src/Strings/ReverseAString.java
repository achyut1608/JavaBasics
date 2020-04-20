package Strings;

public class ReverseAString {
	
	public static void main(String[]args) {
		ReverseAString revString = new ReverseAString();
		String reverse = "Hello World";
		System.out.println(revString.iterative(reverse));
	}
	
	StringBuilder builder = new StringBuilder("");
	
	String recursion(String str,int length) {
		if(length>=0) {
			builder.append(str.charAt(length));
			recursion(str,--length);
		} 
		return builder.toString();
	}
	
	String iterative(String reverse) {
		StringBuilder  iterativeString = new StringBuilder(""); 
		for(int i=reverse.length()-1;i>=0;i--) 
			iterativeString.append(reverse.charAt(i));
		
		
		return iterativeString.toString();
	}
}
