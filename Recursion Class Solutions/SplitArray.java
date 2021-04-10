package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {

	public static void SplitArray(int arr[], int vidx, int splitFirst, int splitSecond, String ans1, String ans2) {

		if (vidx == arr.length) {
			if (splitFirst == splitSecond) {
				System.out.println(ans1 + "and " + ans2);
				return;
			}
			return;
		}

		SplitArray(arr, vidx + 1, splitFirst + arr[vidx], splitSecond, ans1 + arr[vidx] + " ", ans2);
		SplitArray(arr, vidx + 1, splitFirst, splitSecond + arr[vidx], ans1, ans2 + arr[vidx] + " ");

	}

	public static int countsplit(int arr[], int splitFirst, int splitSecond, int index) {
		if (index == arr.length) {
			if (splitFirst == splitSecond) {

				return 1;
			}
			return 0;
		}
		int count = 0;
		count += countsplit(arr, splitFirst + arr[index], splitSecond, index + 1);
		count += countsplit(arr, splitFirst, splitSecond + arr[index], index + 1);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		int ans = countsplit(arr, 0, 0, 0);
		System.out.println(ans);
		SplitArray(arr, 0, 0, 0, "", "");
	}

}
