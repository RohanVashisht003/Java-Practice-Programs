package Hard;

import java.util.Scanner;

public class JumpingNumbers {

	public static void JumpingNumbers(int n, int curr) {
		if (curr > n) {
			return;
		}
		System.out.println(curr);
		if (curr == 0) {
			for (int i = 1; i <= 9; i++) {
				JumpingNumbers(n, i);
			}
		} else {
			int rem = curr % 10;
			if (rem != 0) {
				JumpingNumbers(n, curr * 10 + (rem - 1));
			}
			if (rem != 9) {
				JumpingNumbers(n, curr * 10 + (rem + 1));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		JumpingNumbers(n, 0);
	}

}
