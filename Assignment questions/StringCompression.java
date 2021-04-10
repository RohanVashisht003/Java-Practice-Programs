package Medium;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char ch = s.charAt(0);
		int i = 1, count = 1;
		while (i < s.length()) {
			if (ch == s.charAt(i)) {
				count++;
			} else {
				System.out.print(ch + "" + count);
				ch = s.charAt(i);
				count = 1;
			}
			i++;
		}
		System.out.print(ch + "" + count);
	}

}
