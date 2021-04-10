package Basic;

import java.util.Scanner;

public class IncDec {

	public static void RecursiveCounting(int n) {
		if (n > 0) {
			System.out.println(n);
			RecursiveCounting(n - 1);
			System.out.println(n);
		}
	}

	public static void incdec(int n) {
		if (n > 0) {
			incdec(n - 1);
			System.out.println(n);

		}
	}

	public static void twovar(int start, int n) {
		if (start > n) {
			return;
		}
		System.out.println(start);
		twovar(start + 1, n);
		System.out.println(start);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		RecursiveCounting(n);
//		incdec(n);
//		twovar(1, n);
	}

}
