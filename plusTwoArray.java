/*
 Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
 */
public class plusTwoArray {
	
	public int[] plusTwo(int[] a, int[] b) {
		int total = a.length + b.length;
		int[] newArray = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			newArray[i] = a[i];
		}
		for (int i = a.length; i < total; i++) {
			newArray[i] = b[i - a.length];
		}
		return newArray;
	}

}
