/*
 
Given an array of ints of odd length, look at the first, last, and middle values in the array 
and return the largest. The array length will be a least 1.
 */
public class maxTripleArray {
	
	public int maxTriple(int[] nums) {
		int a = nums[0];
		int b = nums[nums.length / 2];
		int c = nums[nums.length - 1];
		int d = Math.max(a, b);
		int e = Math.max(d, c);
		return e;
	}

}
