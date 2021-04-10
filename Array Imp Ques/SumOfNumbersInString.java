import java.util.Scanner;

public class SumOfNumbersInString {

	public static long SumOfStrings(String str) {
		long sum = 0;
		String ans = "0";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				ans += str.charAt(i);
			} else {
				sum += Long.parseLong(ans);
				ans = "0";
			}
		}
		return sum + Long.parseLong(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		SumOfStrings(str);
	}

}
