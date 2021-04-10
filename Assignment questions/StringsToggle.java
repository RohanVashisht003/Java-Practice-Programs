package Medium;

import java.util.Scanner;

public class StringsToggle {

	public static void toggleChar(String str) {
		char arr[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (arr[i] >= 97 && arr[i] <= 122) {
				arr[i] = Character.toUpperCase(arr[i]);
			} else {
				arr[i] = Character.toLowerCase(arr[i]);
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	public static String Toggle(String str) {
		int i = 0;
		String ans = "";
		while (i < str.length()) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				ans += (Character.toLowerCase(str.charAt(i)));
			} else {
				ans += (Character.toUpperCase(str.charAt(i)));
			}
			i++;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		toggleChar(str);
	}

}
