package Medium;

import java.util.Scanner;

public class LexoCountingModified {

	public static void LexicoCountingModi(int n, int curr) {
		if (Integer.toString(curr).length() == n) {
			System.out.println(curr);
			return;
		}
		// -ve base Case
//		if (Integer.toString(curr).length() > n) {
//			return;
//		}

		int i = 0;
		int ld = curr % 10;
		
		i = ld + 1;
		for (; i <= 9; i++) {
			LexicoCountingModi(curr * 10 + i, n);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		LexicoCountingModi(0,n);

	}
}
