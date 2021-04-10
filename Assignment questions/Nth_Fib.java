package Medium;

import java.util.Scanner;

public class Nth_Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = a + b;
			System.out.println();
			a = b;
			b = sum;
		}
	}

}
