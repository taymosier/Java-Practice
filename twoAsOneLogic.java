/*
 
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
 */

public class twoAsOneLogic {
	
	public boolean twoAsOne(int a, int b, int c) {
		int ab = a + b;
		int ac = a + c;
		int bc = b + c;
		if (ab == c || ac == b || bc == a)
			return true;
		else
			return false;
	}

}
