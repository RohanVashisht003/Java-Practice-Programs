package Practice_Recursion;

import java.util.Scanner;

public class PatternRecursion {

	public static void Print(int n, int row, int col) {
		if (row > n) {
			return;
		}
		if (col > row) {
			System.out.println();
			Print(n, row + 1, 1);
			return;
		}
		System.out.print("*");
		Print(n, row, col + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Print(n, 1, 1);
	}

}
