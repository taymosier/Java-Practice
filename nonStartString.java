/*
 Given 2 strings, return their concatenation, except omit 
 the first char of each. The strings will be at least length 1.
 */
public class nonStartString {
	
	public String nonStart(String a, String b) {
		a = a.substring(1, a.length());
		b = b.substring(1, b.length());

		return a + b;
	}

}
