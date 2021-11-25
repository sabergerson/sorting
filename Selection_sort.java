package hw.TWO;

public class Selection_sort {
	
	public static void main(String[] args) {
		int[] nums = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		int[] sorted = selectionSort(nums);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i]+" ");
		}
	}
	
	//nonrecursive algorithm to sort array by selection
    public static int[] selectionSort(int nums[]) {
    	//iterate through the array to compare elements
    	for (int i = 0; i < nums.length; i++) {
    		//set first element as current minimum
    		int index = i;
    		for (int j = i+1; j < nums.length; j++) {
    			//check if next element is smaller than current
    			if (nums[j] < nums[index]) {
    				//if so, reset as current minimum
    				index = j;
    			}
    		}
    		//swap smaller element with old
    		int low = nums[index];
    		nums[index] = nums[i];
    		nums[i] = low;
    	}
    	//return sorted array
        return nums;
    }
}