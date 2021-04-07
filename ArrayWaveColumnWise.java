package Basic_Lecture1;

import java.util.Scanner;

public class ArrayWaveColumnWise {

	public static void WaveColumn(int arr[][], int col, int row) {
		for(int c = 0; c<col; c++) {
			if(c%2==0) {
				for(int r=0; r<row; r++) {
					System.out.print(arr[r][c]+",");
				}
			}
			else {
				for(int r=row-1; r>=0; r--) {
					System.out.print(arr[r][c]+",");
			}
			}
			System.out.print("end");
		}
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
		WaveColumn(arr,col,row);
	}

}
