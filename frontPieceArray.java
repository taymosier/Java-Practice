/*
 
Given an int array of any length, return a 
new array of its first 2 elements. If the array 
is smaller than length 2, use whatever elements are present.

 */
public class frontPieceArray {
	
	public int[] frontPiece(int[] nums) {
		if (nums.length < 2)
			return nums;
		int[] newArray = new int[2];
		newArray[0] = nums[0];
		newArray[1] = nums[1];
		return newArray;
	}

}
