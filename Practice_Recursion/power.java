package Practice_Recursion;

import java.util.Scanner;

public class power {

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int pow = power(x, n - 1);
		int ans = pow * x;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int ans = power(x, n);
		System.out.println(ans);
	}

}
