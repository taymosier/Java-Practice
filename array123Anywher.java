//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

public class array123Anywher {
	
	public boolean array123(int[] nums) {
		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;
		boolean finalCheck = false;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 1) {
				check1 = true;
			}
			if (nums[i] == 2) {
				check2 = true;
			}
			if (nums[i] == 3) {
				check3 = true;
			}
		}
		if (check1 == true && check2 == true && check3 == true) {
			finalCheck = true;
		}
		return finalCheck;
	}

}
