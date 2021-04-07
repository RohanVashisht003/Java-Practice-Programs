package Basic_Lecture1;

import java.util.Scanner;

public class BitonicSubarray {

	public static int MaxBiotonic(int arr[]) {
		int inc[] = new int[arr.length];
		int dec[] = new int[arr.length];

		inc[0] = 1;
		dec[arr.length - 1] = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				inc[i] = inc[i - 1] + 1;
			} else {
				inc[i] = 1;
			}
		}
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i + 1] < arr[i]) {
				dec[i] = dec[i + 1] + 1;
			} else {
				dec[i] = 1;
			}
		}
		int max = inc[0] + dec[0] - 1;
		for (int i = 1; i < arr.length; i++) {
			if (max < inc[i] + dec[i] - 1) {
				max = inc[i] + dec[i] - 1;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(MaxBiotonic(arr));
	}

}
