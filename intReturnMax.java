/*
 
Given three int values, a b c, return the largest.
 */

public class intReturnMax {

	public int intMax(int a, int b, int c) {
		int max = Math.max(a, b);
		max = Math.max(max, c);
		return max;
	}

}
