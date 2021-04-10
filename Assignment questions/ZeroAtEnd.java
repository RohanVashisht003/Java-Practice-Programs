package Medium;

import java.util.Scanner;

public class ZeroAtEnd {

	public static void ZeroAtEnd(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[counter++] = arr[i];
			}
		}
		while (counter < arr.length) {
			arr[counter++] = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		ZeroAtEnd(arr);
	}

}
