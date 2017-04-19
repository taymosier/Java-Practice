//Given an array of ints length 3, return a new array 
//with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

public class reverse3Array {
	
	public int[] reverse3(int[] nums) {
		int a = nums[0];
		int c = nums[2];

		nums[0] = c;
		nums[2] = a;

		return nums;
	}

}
