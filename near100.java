/*
Given an int n, return true 
if it is within 10 of 100 or 200. 
 */
public class near100 {
	public boolean nearHundred(int n) {
		int a = Math.abs(100 - n);
		int b = Math.abs(200 - n);
		if (a <= 10 || b <= 10) {
			return true;
		} else {
			return false;
		}
	}

}
