/*
 
Count the number of "xx" in the given string. 
We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 */
public class countXXs {
	
	int countXX(String str) {
		String check;
		int count = 0;
		for (int i = 1; i < str.length(); i++) {
			for (int j = i - 1; j < i; j++) {
				check = str.substring(j, i + 1);
				if (check.equals("xx"))
					count++;
			}
		}
		return count;
	}

}
