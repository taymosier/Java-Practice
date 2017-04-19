/*
 
Given 3 int values, a b c, return their sum. However, 
if one of the values is the same as 
another of the values, it does not count towards the sum.
 */
public class LoneSumLogic {
	public int loneSum(int a, int b, int c) {
		if (a == b && b == c) {
			a = 0;
			b = 0;
			c = 0;
		} else if (a == b) {
			a = 0;
			b = 0;
		} else if (a == c) {
			a = 0;
			c = 0;
		} else if (b == c) {
			b = 0;
			c = 0;
		}
		int sum = a + b + c;
		return sum;
	}

}
