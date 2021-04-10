package Easy;

import java.util.Scanner;

public class LongestEvenLengthSub {

	public static void LongestEven(String str, int n) {
		int ans = 0;
		for (int i = 0; i <= n - 2; i++) {
			int l = i, r = i + 1;
			int lsum = 0, rsum = 0;
			while (r < n && l >= 0) {
				lsum += str.charAt(l) - '0';
				rsum += str.charAt(r) - '0';
				if (lsum == rsum) {
					ans = Math.max(ans, (r - l + 1));
				}
				l--;
				r++;
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (n != 0) {
			String str = scn.next();
			LongestEven(str, str.length());
			n--;
		}
	}

}
