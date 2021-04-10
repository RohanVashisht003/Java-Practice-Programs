package Practice_Recursion;

import java.util.Scanner;

public class factorial {

	public static int factorialfind(int n) {
		if (n == 1) {
			return 1;
		}
		int fn1 = factorialfind(n - 1);
		int fact = n * fn1;
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = factorialfind(n);
		System.out.println(ans);
	}

}
