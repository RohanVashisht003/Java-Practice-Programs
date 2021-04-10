package Medium;

import java.util.Scanner;

public class StringSort {

	public static int compareTo(String s1, String s2) {
		int i = 0;

		while (i < s1.length() && i < s2.length()) {

			if (s1.charAt(i) > s2.charAt(i)) {

				return 1;
			} else if (s1.charAt(i) < s2.charAt(i)) {
				return -1;
			}
			i++;

		}

		if (s1.length() > s2.length()) {
			return -1;
		} else {
			return 1;
		}

	}

	public static void sortFunction(String[] arr, int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (compareTo(arr[j], arr[j + 1]) > 0) {

					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.next();
		}
		sortFunction(arr, n);
	for(int i=0;i<n;i++)
    {
       System.out.println(arr[i]);
    }
}
}
