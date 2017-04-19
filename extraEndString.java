/*
 
Given a string, return a new string made of 3 copies of the 
last 2 chars of the original string. The string 
length will be at least 2.
 */
public class extraEndString {
	
	public String extraEnd(String str) {
		int n = str.length();
		String end = str.substring(n - 2, n);
		return (end + end + end);
	}

}
