//Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

public class more20Logic {
	
	public boolean more20(int n) {
		if (n % 20 == 1 || n % 20 == 2) {
			return true;
		} else
			return false;
	}

}
