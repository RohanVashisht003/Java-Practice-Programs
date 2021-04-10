package Practice_Recursion;

import java.util.Scanner;

public class increaseDecreaseCounting {

	public static void Printing(int n) {
		if (n == 0) {
			return;
		}

		// working
		System.out.println(n);
		// updation
		Printing(n - 1);
		// working
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Printing(n);
	}

}
