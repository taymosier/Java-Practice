/*
 Given an array of ints, return true if 6 appears as either the first or last
  element in the array. The array will be length 1 or more.
 */
public class firstLast6Array {
	
	public boolean firstLast6(int[] nums) {
		int n = nums.length;
		if (nums[0] == 6 || nums[n - 1] == 6) {
			return true;
		}
		return false;
	}

}
