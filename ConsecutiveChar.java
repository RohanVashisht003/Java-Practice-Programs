package Basic_Lecture1;

import java.util.Scanner;

public class ConsecutiveChar {

	public static void consecutive(String str, int n) {
		int count = 0;
		int ans = 0;
		char prev = ' ';
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (prev == ch) {
				count++;
			} else {
				prev = ch;
				count = 1;
			}
			ans = Math.max(ans, count);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		consecutive(str, str.length());
	}

}
