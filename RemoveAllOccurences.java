package Basic_Lecture1;

import java.util.Scanner;

public class RemoveAllOccurences {

	public static void RemoveAll(String str, char ch) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				continue;
			}
			ans += str.charAt(i);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char ch = scn.next().charAt(0);
		RemoveAll(str, ch);
	}

}
