package hw.TWO;

public class Recursion_2 {
	
	public static void main(String[] args) {
		int n = 700;
		System.out.print(countZeros(n));
		
	}
	
	//recursive algorithm to identify the number of zeros
	//in the binary version of an integer
	
	//formula for converting integer to binary:
	//divide by two while tracking quotient and remainder
	//continue dividing quotient by two until quotient is zero
	//write out remainders in reverse order
	public static int countZeros(int n) {
		//base case
	   if (n == 0 || n == 1) {
		   return (1 - n);
	   }
	   //if number is even
	    if(n % 2 == 0) {
	    	//recursive call to number divided by two
	    	//plus one
	        return 1 + countZeros(n/2);
	    }
	    //if number is odd
	    else {
	    	//recursive call to number divided by two
	        return countZeros(n/2);
	    }
	}
}