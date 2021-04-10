package Medium;

import java.util.*;

public class SubsequencesWithAscii {
	static int count = 0;

	public static void SubsequencesAscii(String que, String ans) {
		if (que.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		char ch = que.charAt(0);
		String roq = que.substring(1);
		SubsequencesAscii(roq, ans);
		SubsequencesAscii(roq, ans + ch);
		SubsequencesAscii(roq, ans + (int) ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = "";
		SubsequencesAscii(str, ans);
		System.out.println();
		System.out.print(count);
	}

}
