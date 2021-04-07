package Basic_Lecture1;

import java.util.Scanner;

public class jumbles {

	public static boolean Jumbles(String str1, String str2) {
		int i = 0;
		int j = 0;
		int arr1[] = new int[27];
		int arr2[] = new int[27];
		if (str1.length() == str2.length()) {
			while (i < str1.length()) {
				arr1[str1.charAt(i) - 'a']++;
				i++;
			}
			while (j < str2.length()) {
				arr2[str2.charAt(j) - 'a']++;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		String str2 = scn.next();
		if (Jumbles(str1, str2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
