package Medium;

import java.util.Scanner;

public class GenerateParenthesis {

	public static void generateParenthesis(int n, String ans, int c, int o) {
//+vebc
		if (o == n && c == n) {
			System.out.println(ans);
			return;
		}
//-vebc
		if (o > n || c > o) {
			return;
		}
		generateParenthesis(n, ans+"(", c, o + 1);
		generateParenthesis(n, ans+")", c + 1, o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		generateParenthesis(n, "", 0, 0);
	}

}
