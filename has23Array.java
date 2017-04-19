
//Given an int array length 2, return true if it contains a 2 or a 3.

public class has23Array {
	
	public boolean has23(int[] nums) {
		if (nums[0] == 2 || nums[0] == 3)
			return true;
		if (nums[nums.length - 1] == 2 || nums[nums.length - 1] == 3)
			return true;
		return false;
	}

}
