package Basic_Lecture1;

import java.util.Scanner;

public class Easy1 {

	public static void Sort(int arr[]) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[counter++] = arr[i];
			}
		}
		while (counter < arr.length) {
			arr[counter++] = 1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		Sort(arr);
	}

}
