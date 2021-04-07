package Basic_Lecture1;

import java.util.Scanner;

public class TargetSumPair {

	public static void TargetPair(int arr[], int t) {
		for (int i = 0; i < arr.length; i++) {
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
