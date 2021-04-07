package Basic_Lecture1;

import java.util.Scanner;

public class StringCountPalindromicSubstring {

	public static boolean isPalindromic(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static int CountPalindromic(String str) {
		int count = 0;
		for (int si = 0; si < str.length(); si++) {
			for (int ei = si + 1; ei <= str.length(); ei++) {
				String ss = str.substring(si, ei);
				if (isPalindromic(ss)) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int ans = CountPalindromic(str);
		System.out.print(ans);
	}

}
