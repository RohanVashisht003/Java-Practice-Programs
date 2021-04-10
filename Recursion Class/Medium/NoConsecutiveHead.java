package Medium;

import java.util.Scanner;

public class NoConsecutiveHead {

	public static void NoHead(int n, String ans, boolean flag) {
//		System.out.println(ans+"->"+flag);
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (flag) { // last element was head
			NoHead(n, ans + "T", false);
		} else { // last element was tail
			NoHead(n - 1, ans + "H", true);
			NoHead(n - 1, ans + "T", false);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		NoHead(n, "", false);
	}

}
