package Basic_Lecture1;

import java.util.Scanner;

public class StringToggleCase {

	public static String Toggle(String str) {
		int i = 0;
		String ans = "";
		while (i < str.length()) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				ans += (Character.toLowerCase(str.charAt(i)));
			} else {
				ans += (Character.toUpperCase(str.charAt(i)));
			}
			i++;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = Toggle(str);
		System.out.println(ans);
	}

}
