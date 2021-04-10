package Practice_Recursion;

public class climbingStairs {

	public static void climbing(int start, int end, String ans) {
		if (start == end) {
			System.out.println(ans);
			return;
		}
		if (start > end) {
			return;
		}
//		climbing(start+1, end, ans+"1");
//		climbing(start+2, end, ans+"2");
//		climbing(start+3, end, ans+"3");
		for (int i = 1; i <= end; i++) {
			climbing(start + i, end, ans + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		climbing(0, 4, "");
	}

}
