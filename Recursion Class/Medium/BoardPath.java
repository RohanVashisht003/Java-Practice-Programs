package Medium;

import java.util.Scanner;

public class BoardPath {
	static int cnt = 0;
	public static void BoardPath(int n, int m, int faces, String ans) {
		if (n == m) {
			System.out.print(ans + " ");
			cnt++;
			return;
		}
		
		for (int i = 1; i <= faces && i + n <= m; i++) {
			BoardPath(n + i, m, faces, ans + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		BoardPath(0, n, m, "");
		System.out.println();
		System.out.print(cnt);
	}

}
