package Basic_Lecture1;

import java.util.Scanner;

public class LinearTimeSort {

	public static void Print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] Sorting(int arr[]) {
		int lo = 0;
		int hi = arr.length - 1;
		int mid = 0;
		int temp = 0;
		while (mid <= hi) {
			switch (arr[mid]) {
			case 0: {
				temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
				break;
			}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int ans[] = Sorting(arr);
		Print(ans);
	}

}
