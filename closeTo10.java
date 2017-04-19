/*
 
Given 2 int values, return whichever value is 
nearest to the value 10, or return 0 in the event 
of a tie. Note that Math.abs(n) returns the 
absolute value of a number.
 */

public class closeTo10 {
	
	public int close10(int a, int b) {

		if (Math.abs(a - 10) < Math.abs(b - 10)) {
			return a;
		}
		if (Math.abs(b - 10) < Math.abs(a - 10)) {
			return b;
		}
		return 0;
	}
}
