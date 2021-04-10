package Medium;

import java.util.Scanner;

public class DecimalToAny {

	public static int Conversion(int n, int db) {
		int ans = 0;
		int base = 1;
		while (n != 0) {
			int rem = n % db;
			ans = ans + rem * base;
			base = base * 10;
			n /= db;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int db = scn.nextInt();
		int a = Conversion(n, db);
		System.out.println(a);
	}

}
