package Medium;

import java.util.*;

public class PalindromicSubstring {

	public static void PalindromicSubString(String str) {
		int count = 0;
		// OddPalindromic Substring
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit <= 0; orbit++) {
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}

		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis - orbit <= 0; orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis - orbit))) {
					count++;
				} else {
					break;
				}
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		long start = System.currentTimeMillis();
		PalindromicSubString(str);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
