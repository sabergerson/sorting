package hw.TWO;

public class Bubble_sort_recursive {

	public static void main(String[] args) {
		int[] nums = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		int[] sorted = bubble_sort_r(nums, nums.length);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i]+" ");
		}
	}
	
	//recursive bubble sort algorithm
    public static int[] bubble_sort_r(int nums[], int length) {
    	//base case
        if (length == 1) {
            return nums; 
        }
        //check each element expect first
        for (int i = 0; i < length - 1; i++) {
        	//if current element is greater than adjacent
            if (nums[i] > nums[i+1]) {
            	//swap elements
                int temp = nums[i]; 
                nums[i] = nums[i+1]; 
                nums[i+1] = temp; 
            } 
        }
        //recursive call excluding last element already sorted
        bubble_sort_r(nums, length - 1); 
        //return updated array
        return nums;
    }
}