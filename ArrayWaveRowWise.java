package Basic_Lecture1;

import java.util.Scanner;

public class ArrayWaveRowWise {

	public static void WaveRow(int arr[][], int col, int row) {
		for(int i=0; i<row; i++) {
			if(i%2==0) {
				for(int c = 0; c<col; c++) {
					System.out.print(arr[i][c]+", ");
				}
			}
			else {
				for(int c = col-1; c>=0; c--) {
					System.out.print(arr[i][c]+", ");
				}
			}
		}
		System.out.print("END");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();
		int arr[][] = new int[row][col];
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				arr[r][c] = scn.nextInt();
			}
		}
		WaveRow(arr,col,row);
		
	}

}
