package Basic_Lecture1;

import java.util.Scanner;

public class LongestKUnique {

	public static int KUnique(String str, int k) {
		int len = 0;
		int i = 0;
		int j = 0;
		int ans = 0;
		int freq[] = new int[26];

		while (i < str.length()) {
			char ch = str.charAt(i);
			if (freq[ch - 'a'] == 0) {
				len++;
			}
			freq[ch - 'a']++;
			while (len > k) {
				ch = str.charAt(j);
				if (freq[ch - 'a'] == 0) {
					len--;
				}
				freq[ch - 'a']--;
				j++;
			}
			ans = Math.max(ans, i - j + 1);
			i++;
		}
		if (ans < k) {
			return -1;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			String str = scn.next();
			int n = scn.nextInt();

			System.out.println(KUnique(str, n));
			t--;
		}
	}
}
