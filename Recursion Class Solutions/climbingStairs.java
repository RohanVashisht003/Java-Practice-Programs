package Medium;

import java.util.Scanner;

public class climbingStairs {

	public static void StairCase(int src, int des, String ans) {
//		+vebc
		if (src == des) {
			System.out.println(ans);
			return;
		}
//		-vebc
		if (src > des) {
			return;
		}
		StairCase(src + 1, des, ans + "1");
		StairCase(src + 2, des, ans + "2");
		StairCase(src + 3, des, ans + "3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int src = scn.nextInt();
		int des = scn.nextInt();
		StairCase(src, des, "");
	}

}
