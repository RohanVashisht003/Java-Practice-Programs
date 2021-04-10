package Practice_Recursion;

public class generateParenthesis {

	public static void generate(int n, int open, int close, String ans) {
//positive bc
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		// negative bc
		if (open > n ||close>open) {
			return;
		}
		generate(n, open + 1, close, ans + "(");
		generate(n, open, close + 1, ans + ")");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
generate(3, 0, 0,"");
	}

}
