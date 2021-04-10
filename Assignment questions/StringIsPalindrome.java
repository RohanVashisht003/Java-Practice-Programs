package Medium;

import java.util.Scanner;

public class StringIsPalindrome {
	
	public static void Palindrome(String str) {
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		Palindrome(str);
	}

}
