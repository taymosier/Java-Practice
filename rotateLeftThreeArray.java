//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
public class rotateLeftThreeArray {
	public int[] rotateLeft3(int[] nums) {

		int a = nums[0];
		int b = nums[1];
		int c = nums[2];

		nums[0] = b;
		nums[1] = c;
		nums[2] = a;

		return nums;
	}

}
