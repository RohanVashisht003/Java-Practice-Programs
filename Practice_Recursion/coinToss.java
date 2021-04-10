package Practice_Recursion;

public class coinToss {

	public static void coinToss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		coinToss(n - 1, ans + "T"); // Tail
		coinToss(n - 1, ans + "H"); // Head
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coinToss(2, "");
	}

}
