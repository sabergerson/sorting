package hw.TWO;

public class Merge_sort {
	
	public static void main(String[] args) {
		int[] nums = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		int[] sorted = mergeSort(nums, 0, nums.length-1);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i]+" ");
		}
	}
	
	//recursive algorithm to perform merge sort
    public static int[] mergeSort(int[] x, int start, int end) {
    	//base case
    	if (end == start) {
    		int[] base = new int[1];
    		base[0] = x[end];
    		return base;
    	}
    	//divide array in half
        int mid = (start + end) / 2;
        //recursively call on divided halved
        int[] one = mergeSort(x, start, mid);
        int[] two = mergeSort(x, mid + 1, end);
        //merge arrays
        int[] merged = merge(one, two);   
        return merged;
    }
    
    //algorithm to merge arrays and sort them
	public static int[] merge(int[] x, int[] y) {
		//create array of length of both inputs
		int[] z = new int[x.length + y.length];
		//add elements of first 
		for (int i = 0; i < x.length; i++) { 
			z[i] = x[i];
		}
		//add elements of second
		for (int i = 0; i < y.length; i++) { 
			z[x.length+i] = y[i];
		}
		//sort merged array
		for (int i = 0; i < z.length; i++) { 
			for (int j = i + 1; j < z.length; j++) { 
					int temp = 0;  
					if (z[i] > z[j]) { 
						temp = z[i];  
						z[i] = z[j];  
						z[j] = temp;  
					}  
			}
		}
		//return merged array
		return z;		
	}
}