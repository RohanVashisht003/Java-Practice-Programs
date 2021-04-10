package Medium;

import java.util.Scanner;

public class SpiralPrint {

	public static void SpiralPrint(int arr[][]) {
		int mincol = 0;
		int minrow = 0;
		int maxrow = arr.length - 1;
		int maxcol = arr[0].length - 1;
		
		int element=0;
		while(element<arr.length*arr[0].length) {
			for(int col = mincol; col<=maxcol; col++) {
				System.out.print(arr[minrow][col]+", ");
				element++;
			}
			minrow++;
			
			for(int row=minrow; row<=maxrow; row++)
	        {
	            System.out.print(arr[row][maxcol]+", ");
	            element++;
	        }
	        maxcol--;
	        
	        for(int col=maxcol; col>=mincol; col--)
	        {
	            System.out.print(arr[maxrow][col]+", ");
	            element++;
	        }
	        maxrow--;
	        
	        for(int row=maxrow; row>=minrow; row--)
	        {
	            System.out.print(arr[row][mincol]+", ");
	            element++;
	        }
	        mincol++;
		}
		System.out.print("END");
	}

	public static int[][] input() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter rows");
		int row = scn.nextInt();
		int arr[][] = new int[row][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter cols for" + i + "row");
			int col = scn.nextInt();
			arr[i] = new int[col];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][] = input();
SpiralPrint(arr);
	}

}
