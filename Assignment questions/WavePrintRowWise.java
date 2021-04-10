package Medium;

import java.util.Scanner;

public class WavePrintRowWise {

	public static void Printing(int arr[][],int n, int m) {
		for (int i = 0; i < n; i++) {
			if(i%2==0) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]+", ");
			}
			}
			else {
				for(int j=m-1; j>=0; j--) {
					System.out.print(arr[i][j]+", ");
				}
			}
		}
		System.out.println("END");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		Printing(arr,n,m);

	}

}
