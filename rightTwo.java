/*
 
Given a string, return a "rotated right 2" version where the last 2 chars are 
moved to the start. The string length will be at least 2.
 */
public class rightTwo {

	public String right2(String str) {
		int n = str.length();
		return str.substring(n - 2, n) + str.substring(0, n - 2);
	}

}
