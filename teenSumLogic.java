/*
 
Given 2 ints, a and b, return their sum. However, "teen" 
values in the range 13..19 inclusive, are extra lucky. 
So if either value is a teen, just return 19.
 */
public class teenSumLogic {
	
	public int teenSum(int a, int b) {
		if ((a > 12 && a < 20) || (b > 12 && b < 20)) {
			return 19;
		} else
			return (a + b);
	}

}
