package hw.TWO;

public class Recursion_1 {
	
	public static void main (String[] args) {
		
		double[] x = {7, 5, 21, 26, 4, 1, 17, 5};
		System.out.println(max(x, 0, 7));
	}
	
	//binary recursive algorithm to find max element in an array
	public static double max(double[] x, int start, int end) {
		//base case
		if (end == start) {
			return x[start];
		}
		//find midpoint in array
		int mid = (start+end) / 2;
		//recursively call on halved array
		double max1 = max(x, start, mid);
		double max2 = max(x, mid+1, end);
		//identify which max is bigger
		if (max1 >= max2) {
			return max1;
		}
		else {
			return max2;
		}
	}
}