//Given an array of ints length 3, return the sum of all the elements.
public class sum3Array {
	
	public int sum3(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		return sum;
	}

}
