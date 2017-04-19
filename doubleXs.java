/*
 
Given a string, return true if the first 
instance of "x" in the string is immediately 
followed by another "x".
 */
public class doubleXs {
	
	boolean doubleX(String str) {
		String sub;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.indexOf('x') == -1) {
				return false;
			}
			int test = str.indexOf('x');
			sub = str.substring(test);
			if (sub.startsWith("xx")) {
				return true;
			}
		}
		return false;

	}

}
