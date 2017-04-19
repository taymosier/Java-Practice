/*
 Given a string, 
 return a new string where the first 
 and last chars have been exchanged.
 */
public class frontBack {
	public String frontAndBack(String str) {
		int length = str.length();
		if (str.length() < 2) {
			return str;

		}
		String beginning = str.substring(0, 1);
		String end = str.substring(length - 1);
		String middle = str.substring(1, length - 1);
		return end + middle + beginning;
	}

}
