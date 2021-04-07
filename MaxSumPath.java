package Basic_Lecture1;

import java.util.Scanner;

public class MaxSumPath {

	public static int MaximumPath(int arr1[], int arr2[], int m, int n) {
		int sum1 = 0, sum2 = 0, result = 0;
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				sum1 += arr1[i];
				i++;
			} else if (arr2[j] < arr1[i]) {
				sum2 += arr2[j];
				j++;
			} else {
				result += Math.max(sum1, sum2);
				sum1 = 0;
				sum2 = 0;
				int temp = i;
				while (i < m && arr1[i] == arr2[j]) {
					sum1 += arr1[i];
					i++;
				}
				while (j < n && arr1[temp] == arr2[j]) {
					sum2 += arr2[j];
					j++;
				}
				result += Math.max(sum1, sum2);
				sum1 = 0;
				sum2 = 0;
			}
		}

		while (i < m) {
			sum1 += arr1[i];
			i++;
		}
		while (j < n) {
			sum2 += arr2[j];
			j++;
		}

		result += Math.max(sum1, sum2);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int m = scn.nextInt();
			int n = scn.nextInt();
			int arr1[] = new int[m];
			int arr2[] = new int[n];

			for (int i = 0; i < m; i++) {
				arr1[i] = scn.nextInt();
			}
			for (int j = 0; j < n; j++) {
				arr2[j] = scn.nextInt();
			}

			System.out.println(MaximumPath(arr1, arr2, m, n));
			t--;
		}
	}

}
