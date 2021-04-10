package Easy;

import java.util.Scanner;

public class ShiftMatrixByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[][] = new int[n][n];
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = scn.nextInt();
			}
		}
		int k = scn.nextInt();
		for (int r = 0; r < n; r++) {
			for (int c = k; c < n; c++) {
				System.out.print(arr[r][c] + " ");
			}
			for (int c = 0; c < k; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}

}
