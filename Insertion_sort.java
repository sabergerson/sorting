package hw.TWO;

public class Insertion_sort {
	
	public static void main(String[] args) {
		int[] nums = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		int[] sorted = insertionSort(nums);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i]+" ");
		}
	}
	
	//non-recursive algorithm to sort by insertion
    public static int[] insertionSort(int nums[]) {
    	//find length
        int length = nums.length;
        //check each element 
        for (int i = 1; i < length; i++) {
        	//hold current element
        	int hold = nums[i];
        	int j = i - 1;
        	//check if current element is less than other elements
        	//moving towards the front of the array
        	while ((j > -1) && (nums[j] > hold)) {
        		//find location where element is to be inserted
        		nums[j + 1] = nums[j];
        		j--;
        	}
        	//insert element
        	nums[j + 1] = hold;
        }
        //return sorted array
        return nums;
    }
}