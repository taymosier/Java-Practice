/*
 
Given a string, 
return true if the string starts 
with "hi" and false otherwise.
 */
public class startHi {
	public boolean startsWithHi(String str) {
		if (str.length() < 2) {
			return false;
		}
		String front = str.substring(0, 2);
		return (front.equals("hi"));
	}

}
