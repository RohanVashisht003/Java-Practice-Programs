package Easy;

import java.util.*;

public class Jumbles {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String src1 = sc.next(); // first string
		String src2 = sc.next();// second string
		if (jumbles(src1, src2)) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
	}

	public static boolean jumbles(String src1, String src2) {
		int arr1[] = new int[27];
		int arr2[] = new int[27];
		int i = 0;// for src 1
		int j = 0;// for src 2
		if (src1.length() == src2.length()) {
			while (i < src1.length()) {
				arr1[src1.charAt(i) - 'a' + 1]++;
				i++;
			}
			while (j < src2.length()) {
				arr2[src2.charAt(j) - 'a' + 1]++;
				j++;
			}
		} else {
			return false;
		}
		for (i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
}
