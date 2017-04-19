import java.util.Scanner;

/*
 
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. 
Compute the result recursively (without loops).
 */

public class FactorialLogic {
	
	public static int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = in.nextInt();
		in.close();		
		System.out.println(factorial(input));
	}
}
