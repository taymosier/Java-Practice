/*
 
Given a string, take the last char and return a 
new string with the last char added at the front 
and back, so "cat" yields "tcatt". The original 
string will be length 1 or more.

 */
public class backAround {
	public String backAddedToFront(String str) {
		int n = str.length();
		String last = str.substring(n - 1);
		return last + str + last;
	}
}
