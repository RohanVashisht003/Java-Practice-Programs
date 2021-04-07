package Basic_Lecture1;

import java.util.Scanner;

public class Ispalindrome {
	public static boolean Palindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		if (Palindrome(str1)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
