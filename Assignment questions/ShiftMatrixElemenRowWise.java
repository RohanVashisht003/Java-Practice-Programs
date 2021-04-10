package Easy;

import java.util.Scanner;

public class ShiftMatrixElemenRowWise {

	public static void Shifting(int arr[][], int n, int k) {

		for (int j = 0; j < n; j++) {
			for (int i = k; i < n; i++) {
				System.out.print(arr[j][i] + " ");
			}

			for (int i = 0; i < k; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int k = scn.nextInt();
		Shifting(arr, n, k);
	}

}
