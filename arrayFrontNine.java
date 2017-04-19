/*
 
Given an array of ints, return true 
if one of the first 4 elements in the array 
is a 9. The array length may be less than 4.
 */
public class arrayFrontNine {
	
	public boolean arrayFront9(int[] nums) {
		boolean check = false;
		if (nums.length < 4) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 9) {
					check = true;
				}
			}
		} else {
			for (int i = 0; i < 4; i++) {
				if (nums[i] == 9) {
					check = true;
				}
			}
		}
		return check;
	}

}
