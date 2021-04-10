package Medium;

import java.util.Scanner;

public class StringsMaxFreqChar {

	public static char MaxFreq(String str) {
		int n = str.length();
		int count[] = new int[256];
		for (int i = 0; i < n; i++) {
			count[str.charAt(i)]++;
		}
		int max = Integer.MIN_VALUE;
		char ans = ' ';
		for (int i = 0; i < n; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				ans = str.charAt(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char ch = MaxFreq(str);
		System.out.println(ch);
	}

}
