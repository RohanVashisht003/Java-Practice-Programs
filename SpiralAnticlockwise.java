package Basic_Lecture1;

import java.util.Scanner;

public class SpiralAnticlockwise {

	public static void Printing(int arr[][], int m, int n) {
		int minrow = 0;
		int mincol = 0;
		int maxrow = arr.length - 1;
		int maxcol = arr[0].length - 1;
		int te = arr.length * arr[0].length;
		int count = 0;
		while (count < te) {
			for (int row = minrow; row <= maxrow; row++) {
				System.out.print(arr[row][mincol] + ", ");
				count++;
			}
			mincol++;

			for (int col = mincol; col <= maxcol; col++) {
				System.out.print(arr[maxrow][col] + ", ");
				count++;
			}
			maxrow--;

			for (int row = maxrow; row >= minrow; row--) {
				System.out.print(arr[row][maxcol] + ", ");
				count++;
			}
			maxcol--;

			for (int col = maxcol; col >= mincol; col--) {
				System.out.print(arr[minrow][col] + ", ");
				count++;
			}
			minrow++;
		}
		System.out.print("END");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		Printing(arr, m, n);
	}

}
