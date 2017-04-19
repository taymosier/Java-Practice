/*
 
Given a string, return a new string made of 
every other char starting with the first, so 
"Hello" yields "Hlo".
 */
public class stringBitsOf {
	
	public String stringBits(String str) {
		String newWord = "";
		if (str.length() % 2 != 0) {
			for (int i = 0; i < str.length(); i = i + 2) {
				newWord = newWord + str.charAt(i);
			}
		} else if (str.length() % 2 == 0) {
			for (int i = 0; i < str.length(); i = i + 2) {
				newWord = newWord + str.charAt(i);
			}
		}
		return newWord;

	}

}
