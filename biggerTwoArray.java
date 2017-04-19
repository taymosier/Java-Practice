/*

Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. 
Return the array which has the largest sum. In event of a tie, return a.
 */
public class biggerTwoArray {
	
	public int[] biggerTwo(int[] a, int[] b) {
		int sumA = a[0] + a[1];
		int sumB = b[0] + b[1];
		int max = Math.max(sumA, sumB);
		if (max == sumA || sumA == sumB)
			return a;
		if (max == sumB)
			return b;
		return a;
	}

}
