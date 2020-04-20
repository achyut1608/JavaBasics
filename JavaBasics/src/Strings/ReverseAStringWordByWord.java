package Strings;
/**
 * 
 * @author Achyut
 *	Reverse a String from word by word
 */
public class ReverseAStringWordByWord {

	public static void main(String[] args) {
		ReverseAStringWordByWord word = new ReverseAStringWordByWord();  
		String sentence = "This is From Achyut Thaker";
		word.splitString(sentence);
	}
	StringBuilder builder = new StringBuilder("");
	 void splitString(String sentence) {
		String [] words = sentence.split(" ");
		for(int i=0;i<words.length;i++) {
			reverse = new StringBuilder();
			builder.append(recursive(words[i],words[i].length()-1)+" ");
		}
		System.out.println(builder.toString());
	}
	
	StringBuilder  reverse = new StringBuilder("");
	String recursive(String string,int length) {
		
		if(length>=0) {
			
			reverse.append(string.charAt(length));
			recursive(string,--length);
		}
		
		return reverse.toString();
	}

}
