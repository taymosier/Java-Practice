/*
 
Given an array of ints of even length, return a new array length 2 
containing the middle two elements from the original array. 
The original array will be length 2 or more.
 */
public class makeMiddleArray {
	
	public int[] makeMiddle(int[] nums) {
		int[] newArray = new int[2];
		newArray[0] = nums[(nums.length / 2) - 1];
		newArray[1] = nums[nums.length / 2];
		return newArray;
	}

}
