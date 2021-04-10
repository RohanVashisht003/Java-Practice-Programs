package Medium;

import java.util.Scanner;

public class Permutation {

	public static void GetPermutation(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			GetPermutation(ros, ans + ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		GetPermutation(str, "");
	}

}
