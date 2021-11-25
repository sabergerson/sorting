package hw.TWO;

public class Arrays_One {
	
	public static void main(String args[]) {
		String one = "google";
		String two = "elgoog";
		System.out.print(check_reverse(one, two));
	}
	
	//algorithm to check if one word is the same 
	//as the other backward
	public static int check_reverse(String one, String two) {
		//reverse second word
		String reversed = reverse(two);
		//check if reversed word is the same as first word
		if (one.equals(reversed)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	//recursive algorithm to reverse a word
	public static String reverse(String word) {
		//base case
	    if (word.length() == 0) {
	        return word;
	    }
	    else {
	    	//recursive call with first element moved to end
	        return reverse(word.substring(1)) + word.charAt(0);
	    }
	}
}