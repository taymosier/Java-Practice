//Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
//Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
public class nearTenLogic {
	
	public boolean nearTen(int num) {
		if (num % 10 > 7 || num % 10 < 3)
			return true;
		return false;
	}

}
