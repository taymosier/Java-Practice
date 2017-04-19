/*
 
Given 2 int values, return true if they are 
both in the range 30..40 inclusive, or they 
are both in the range 40..50 inclusive.
 */
public class inBetween30or50 {
	
	public boolean in3050(int a, int b) {
		if (a % 30 <= 10 && b % 30 <= 10) {
			return true;
		}
		if (a % 40 <= 10 && b % 40 <= 10) {
			return true;
		}
		return false;
	}

}
