package Medium;

import java.util.Scanner;

public class PalindromePartitions {

	public static boolean isPalindromic(String str) {
		int i=0; 
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static void PalindromicPartition(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String part = ques.substring(0, i);
			String ros = ques.substring(i);
			PalindromicPartition(ros, ans + part + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String ques = scn.next();

		PalindromicPartition(ques, "");

	}

}
