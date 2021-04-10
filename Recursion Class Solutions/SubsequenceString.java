package Medium;

import java.util.Scanner;

public class SubsequenceString {
	static int count = 0;

	public static void SubSequences(String str, String ans) {
		if (str.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		char ch = str.charAt(0);
		String roq = str.substring(1);

		SubSequences(roq, ans);
		SubSequences(roq, ans + ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = "";
		SubSequences(str, ans);
		System.out.println();
		System.out.print(count);
	}

}
