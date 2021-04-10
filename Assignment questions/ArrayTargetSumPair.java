package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTargetSumPair {

	public static void TargetPair(int arr[], int t) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == t) {
					System.out.println(arr[i] + " and " + arr[j]);
				}
			}
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
		int t = scn.nextInt();
		TargetPair(arr, t);
	}

}
