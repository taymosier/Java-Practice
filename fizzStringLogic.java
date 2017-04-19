/*
 
Given a string str, if the string starts with "f" return "Fizz". 
If the string ends with "b" return "Buzz". If both the "f" and 
"b" conditions are true, return "FizzBuzz". In all other cases, 
return the string unchanged.
 */

public class fizzStringLogic {
	
	public String fizzString(String str) {
		String result = str;
		if (str.startsWith("f") && str.endsWith("b")) {
			result = "FizzBuzz";
		} else if (str.startsWith("f")) {
			result = "Fizz";
		} else if (str.endsWith("b")) {
			result = "Buzz";
		}
		return result;
	}

}
