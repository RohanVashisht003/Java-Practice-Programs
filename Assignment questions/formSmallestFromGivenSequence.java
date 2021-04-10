package Hard;

import java.util.Scanner;

public class formSmallestFromGivenSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			String str = scn.next();
			int[] ans = new int[str.length() + 1];
			int count = 1;
			for (int i = 0; i <= str.length(); i++) {
				if (i == str.length() || str.charAt(i) == 'I') {
					ans[i] = count;
					count++;

					for (int j = i - 1; j >= 0 && str.charAt(j) == 'D'; j--) {
						ans[j] = count;
						count++;
					}
				}
			}
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i] + " ");
			}
		}
	}

}
