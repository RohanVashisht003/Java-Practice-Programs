package Easy;

import java.util.Scanner;

public class SubarraySumPrint {

	public static void SubarraySum(int arr[]) {
		for (int si = 0; si < arr.length; si++) {
			for (int ei = si; ei < arr.length; ei++) {
				int sum = 0;
				for (int k = si; k <= ei; k++) {
					sum += arr[k];
				}
				System.out.println(sum);
			}
		}
	}

	public static void SubarrayUsingTwoLoops(int arr[]) {
		for (int si = 0; si < arr.length; si++) {
			int sum = 0;
			for (int ei = si; ei < arr.length; ei++) {
				sum += arr[ei];
				System.out.println(sum);
			}
		}
	}

	public static void SubarrayPrint(int arr[]) {
		for (int si = 0; si < arr.length; si++) {
			for (int ei = si; ei < arr.length; ei++) {
				for (int k = si; k <= ei; k++) {
					System.out.print(arr[k] + ",");
				}
				System.out.println();
			}
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
//		SubarraySum(arr);
//		SubarrayUsingTwoLoops(arr);
		SubarrayPrint(arr);
	}

}
