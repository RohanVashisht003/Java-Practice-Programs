package Medium;

import java.util.Scanner;

public class WavePrint {

	public static void wavePrint(int arr[][]) {
		for (int j = 0; j < arr[0].length; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i][j]+" ");
				}
			} else {
				for (int i = arr.length - 1; i >=0; i--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}

	public static int[][] Input() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Rows?");
		int r = scn.nextInt();
		int arr[][] = new int[r][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Cols for" + i + "rows?");
			int c = scn.nextInt();
			arr[i] = new int[c];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = Input();
		wavePrint(arr);
	}
}
