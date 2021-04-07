package Basic_Lecture1;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestDifferencetriplet {

	public static void smallestDifference(int arr1[], int arr2[], int arr3[], int n) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		int i = 0, j = 0, k = 0;
		int ans_min = 0, ans_max = 0, ans_mid = 0;
		
		int diff = Integer.MAX_VALUE;
		while (i < n && j < n && k < n) {
			int sum = arr1[i] + arr2[j] + arr3[k];
			int max = Math.max(Math.max(arr1[i], arr2[j]), arr3[k]);
			int min = Math.min(Math.min(arr1[i], arr2[j]), arr3[k]);
			if (min == arr1[i]) {
				i++;
			} else if (min == arr2[j]) {
				j++;
			} else {
				k++;
			}
			if (diff > (max - min)) {
				diff = max - min;
				ans_min = min;
				ans_mid = sum - (max + min);
				ans_max = max;
			}
		}
		System.out.println(ans_max + " " + ans_mid + " " + ans_min);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int arr3[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr3[i] = scn.nextInt();
		}

		smallestDifference(arr1, arr2, arr3, n);
	}
}
