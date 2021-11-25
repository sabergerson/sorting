package hw.TWO;

public class Quick_sort {
	
	public static void main(String[] args) {
		int[] nums = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		int[] sorted = quick_sort(nums, 0, nums.length-1);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i]+" ");
		}
	}
	
	//algorithm to partition elements of array relative to pivot value
	public static int partition(int[] nums, int start, int end) {
		//set pivot to the last element 
	    int pivot = nums[end];
	    //initialize the position to start minus one as it will be incremented
	    //to zero before first swap is made
	    int pos = (start - 1);
	    for (int i = start; i < end; i++) {
	    	//check if first number is less than last
	        if (nums[i] <= pivot) {
	            pos++;
	            //if so, switch the position of the pivot and number
	            int temp = nums[pos];
	            nums[pos] = nums[i];
	            nums[i] = temp;
	        }
	    }
	    //set the pivot in its final position
	    int temp = nums[pos+1];
	    nums[pos+1] = nums[end];
	    nums[end] = temp;
	    //return the position of the pivot
	    return pos+1;
	}
	
	//recursive algorithm that uses the partition function to implement
	//quicksort
	public static int[] quick_sort(int[] nums, int start, int end) {
		//basecase
		if (start == end) {
			return nums;
		}
		//recursive decomposition
	    if (start < end) {
	    	//call the partition function to find pivot 
	    	//location index
	        int index = partition(nums, start, end);
	        //call quick sort on the arrays separated 
	        //around the pivot
	        quick_sort(nums, start, index - 1);
	        quick_sort(nums, index + 1, end);
	    }
	    return nums;
	}
}