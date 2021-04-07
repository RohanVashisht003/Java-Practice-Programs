package Basic_Lecture1;

import java.util.Scanner;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int maxRight = arr[arr.length - 1];
		System.out.print(maxRight + " ");

		for (int i = arr.length - 2; i >= 0; i--) {
			if (maxRight <= arr[i]) {
				maxRight = arr[i];
				System.out.print(maxRight + " ");
			}
		}

	}

}
