package Easy;

import java.util.Scanner;

public class TwoDimensionalArray {
	static Scanner scn = new Scanner(System.in);

	public static void Input() {
//		int[][] arr = new int[3][5];
//		System.out.println(arr);
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		System.out.println("Rows?");
		int row = scn.nextInt();
		int jarr[][] = new int[row][];
//		System.out.println(jarr);
//		System.out.println(jarr[0]);
//		System.out.println(jarr[1]);
//		System.out.println(jarr[2]);
//		
//		jarr[0] = new int[4];
//		jarr[1] = new int[2];
//		jarr[2] = new int[3];
//		
//		System.out.println(jarr[0].length);
//		System.out.println(jarr[1].length);
//		System.out.println(jarr[2].length);

		for (int i = 0; i < jarr.length; i++) {
			System.out.println("cols for" + i + "row?");
			int cols = scn.nextInt();
			jarr[i] = new int[cols];
			for (int j = 0; j < jarr[i].length; j++) {
				jarr[i][j] = scn.nextInt();
			}
			System.out.println();
		}

		for (int i = 0; i < jarr.length; i++) {
			for (int j = 0; j < jarr[i].length; j++) {
				System.out.print(jarr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = scn.nextInt();
		Input();
	}

}
