package hw.TWO;

public class Bubble_sort_nonrecursive {
	
	public static void main(String[] args) {
		int[] nums = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		int[] sorted = bubble_sort_nr(nums);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i]+" ");
		}
	}

	//nonrecursive bubble sort algorithm
	public static int[] bubble_sort_nr(int[] nums) {
		//checking all other elements except first
        for (int i = 0; i < nums.length - 1; i++) {
        	//checking all other elements except those already checked
            for (int j = 0; j < nums.length - i - 1; j++) {
            	//if current element is greater than one after
                if (nums[j] > nums[j + 1]) {
                	//swap elements
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        //return new array
        return nums;
	}
}