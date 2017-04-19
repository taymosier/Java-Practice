/*
 
Given a string, return a "rotated left 2" version where the first 2 
chars are moved to the end. The string length will be at least 2.
 */
public class leftTwo {
	
	public String left2(String str) {
		int length = str.length();
		String temp = str.substring(0, 2);
		str = str.substring(2, length);
		return str + temp;
	}

}