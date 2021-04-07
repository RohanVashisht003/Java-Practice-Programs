package Basic_Lecture1;

import java.util.Scanner;

public class SumOfNumbersString {

	public static int CalculateSum(String str) {
		int l = str.length();
		int sum = 0;
		String temp = "0";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum + Integer.parseInt(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			String str = scn.next();

			System.out.println(CalculateSum(str));
			t--;
		}
	}
}
