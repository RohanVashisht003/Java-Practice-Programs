package Basic_Lecture1;

import java.util.Scanner;

public class UnionIntersectionArrays {

	public static void printUnion(int arr1[], int arr2[]) {
		int max = Integer.MIN_VALUE;
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				if (arr1[i] > max) {
					System.out.print(arr1[i] + " ");
				}
				i++;
			} else if (arr1[i] > arr2[j]) {
				if (arr2[j] > max) {
					System.out.print(arr2[j] + " ");
				}
				j++;
			} else {
				if (arr1[i] > max) {
					max = arr1[i];
					System.out.print(arr1[i] + " ");
				}
				i++;
				j++;
			}
		}
		while (i < arr1.length) {
			if (arr1[i] > max) {
				max = arr1[i];
				System.out.print(arr1[i] + " ");
				i++;
			} else {
				i++;
				j++;
			}
		}
		while (j < arr2.length) {
			if (arr2[j] > max) {
				max = arr2[j];
				System.out.print(arr2[j] + " ");
				j++;
			} else {
				i++;
				j++;
			}
		}
	}

	public static void printIntersection(int arr1[], int arr2[]) {
		int i = 0;
		int j = 0;
		int max = Integer.MIN_VALUE;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				if (arr1[i] > max) {
					max = arr1[i];
					System.out.print(arr1[i] + " ");
				}
				if (arr1[i] == max) {
					i++;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int arr1[] = new int[m];

		for (int i = 0; i < m; i++) {
			arr1[i] = scn.nextInt();
		}
		int n = scn.nextInt();
		int arr2[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = scn.nextInt();
		}
		printUnion(arr1, arr2);
		System.out.println();
		printIntersection(arr1, arr2);
	}

}
