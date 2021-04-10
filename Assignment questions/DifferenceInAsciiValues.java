package Medium;

import java.util.Scanner;

public class DifferenceInAsciiValues {

	public static void DifferenceInAscii(String str) {
		String ans = "";
		for (int i = 0; i < str.length() - 1; i++) {
			ans += str.charAt(i);
			int asciiDiff = str.charAt(i+1) - str.charAt(i);
			ans+= asciiDiff;
			
		}
		ans+=str.charAt(str.length()-1);
		System.out.print(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		DifferenceInAscii(str);
	}

}
