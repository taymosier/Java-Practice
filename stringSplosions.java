/*
 
Given a non-empty string like "Code" return a string like "CCoCodCode".
 */
public class stringSplosions {

	public String stringSplosion(String str) {
		String newWord = "";
		String addition = "";
		for (int i = 0; i < str.length() - 1; i++) {
			addition = addition + str.charAt(i);
			newWord = newWord + addition;
		}
		newWord = newWord + str;
		return newWord;
	}

}
