package Easy;

import java.util.Scanner;

public class Armstrong {

	public static void printArmstrong(int lo, int hi) {
		for (int n = lo; n <= hi; n++) {
			boolean res = isArmstrong(n);

			if (res == true) {
				System.out.println(n);
			}
		}
	}

	public static boolean isArmstrong(int n) {
		int ans = 0;
		int rem;
		int digits = noOfDigits(n);
		int num = n;
		while (n != 0) {
			rem = n % 10;
			ans += (int) (Math.pow(rem, digits));
			n /= 10;
		}
		if (ans == num) {
			return true;
		} else {
			return false;
		}
	}

	public static int noOfDigits(int n) {
		int digits = 0;
		while (n != 0) {
			n /= 10;
			digits++;
		}
		return digits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();
		printArmstrong(lo, hi);
	}

}
