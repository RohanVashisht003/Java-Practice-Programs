package Medium;

import java.util.Scanner;

public class MaximumNumberKDigits {
	static String max = "";

	public static void MaximumIntegerKSwaps(char[] str, int k) {
		if (k == 0) {
			return;
		}
		int n = str.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i] < str[j]) {
					char t = str[i];
					str[i] = str[j];
					str[j] = t;
					if (String.valueOf(str).compareTo(max) > 0) {
						max = String.valueOf(str);
					}
					MaximumIntegerKSwaps(str, k - 1);
					char c = str[i];
					str[i] = str[j];
					str[j] = c;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();
		max = str;
		MaximumIntegerKSwaps(str.toCharArray(), k);
		System.out.println(max);
	}

}
