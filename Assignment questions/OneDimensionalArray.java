package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray {
	public static int[] reverse(int arr[]) {
		int n = arr.length - 1;
		for (int i = 0; i <= n / 2; i++) {
			int temp = arr[n - i];
			arr[n - i] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public static int maxNumber(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int LinearSearch(int[] arr, int num) {
		int i = 0;
		while (i <= arr.length - 1) {
			if (arr[i] == num) {
				return i;
			} else {
				i++;
			}
		}
		return -1;
	}

	public static int BinarySearch(int[] arr, int num) {
		int lo = 0;
		int hi = arr.length - 1;
		int mid;
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (num > arr[mid]) {
				lo = mid + 1;
			} else if (num == arr[mid]) {
				return mid;
			} else {
				hi = mid - 1;
			}
		}
		return -1;
	}

	public static void TargetSumTriplet(int[] arr, int num) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == num) {
						System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
					}
				}
			}
		}
	}

	public static void TargetSum(int arr[], int num) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == num) {
					System.out.println(arr[i] + " and " + arr[j]);
				}

			}
		}
	}

	public static void display(int arr[]) {
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
		Arrays.sort(arr);
//		System.out.println(maxNumber(arr));
//		System.out.println(LinearSearch(arr, 0));
//		System.out.println(BinarySearch(arr, 0));
//		TargetSumTriplet(arr, 9);
//		TargetSum(arr, 5);
	}
}
