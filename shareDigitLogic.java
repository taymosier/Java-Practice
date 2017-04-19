/*
 
Given two ints, each in the range 10..99, return true if there 
is a digit that appears in both numbers, such as the 2 in 12 and 23. 
(Note: division, e.g. n/10, gives the left digit while the % "mod" 
n%10 gives the right digit.)
 */
public class shareDigitLogic {
	
	public boolean shareDigit(int a, int b) {
		int aFirst = a / 10;
		int aSecond = a % 10;
		int bFirst = b / 10;
		int bSecond = b % 10;
		if (a < 10 || b < 10) {
			return (a == b);
		} else if (a % 10 == 0 & b % 10 == 0) {
			return true;
		} else if (bFirst == aFirst || bFirst == aSecond) {
			return true;
		} else if (aFirst == bFirst || aFirst == bSecond) {
			return true;
		}
		return false;
	}

}
