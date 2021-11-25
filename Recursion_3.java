package hw.TWO;

public class Recursion_3 {
	
    public static void main(String[] args) {
        String word = "racecar";
        char letters[] = word.toCharArray();
        int length = word.length();
        if(palindrome_check(letters, 0, length - 1) == 1) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
    }
	
    //recursive algorithm to check if word is a palindrome
    public static int palindrome_check(char[] letters, int start, int end) {
    	//base case
        if(start == end || (end - start == 1)) {
            return 1;
        }
        else {
        	//check if first and last letters are equal
            if(letters[start] == letters[end]) {
            	//recursively call on next two letter further inside word
                return palindrome_check(letters, start+1, end-1);
            }
            else {
                return 0;
            }
        }
    }
}