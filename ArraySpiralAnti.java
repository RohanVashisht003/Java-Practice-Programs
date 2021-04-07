package Basic_Lecture1;

import java.util.Scanner;

public class ArraySpiralAnti {

	public static void Spiral(int arr[][],int row, int col) {
		int sr=0,er=row-1;
		int sc=0,ec=col-1;
		int i=0;
		while(i<arr[0].length*arr.length) {
			for(int r=sr; r<=er; r++) {
				System.out.print(arr[r][sc]+", ");
				i++;
			}
			sc++;
			for(int c = sc; c<=ec; c++) {
				System.out.print(arr[er][c]+", ");
				i++;
			}
			er--;
			for(int r = er; r>=sr; r--) {
				System.out.print(arr[r][ec]+", ");
				i++;
			}
			ec--;
			for(int c = ec; c>=sc; c--) {
				System.out.print(arr[sr][c]+", ");
				i++;
			}
			sr++;
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
		Spiral(arr,row,col);
	}

}
