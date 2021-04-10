package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class FormBiggestNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			sort(arr);

			display(arr);
			t--;
		}
	}

	public static void display(int[] arr) {

		for (int val : arr) {
			System.out.print(val + "");
		}

		System.out.println();
	}


	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (compare(arr[j], arr[j + 1]) > 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static int compare(int n1, int n2) {
		String val1 = n1 + "" + n2;
		String val2 = n2 + "" + n1;

		int val1int = Integer.valueOf(val1);
		int val2int = Integer.valueOf(val2);

		if (val1int > val2int)
			return -1;
		else
			return 1;
	}

}
