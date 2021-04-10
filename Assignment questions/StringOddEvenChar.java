package Medium;

import java.util.Scanner;

public class StringOddEvenChar {

	public static String OddEvenChar(String str) {
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if((i+1)%2==0) {
				ans+=((char)(ch-1));
			}
			else {
				ans+=((char)(ch+1));
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String st = scn.next();
		String ans = OddEvenChar(st);
		System.out.print(ans);
	}

}
