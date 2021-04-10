package Medium;

import java.util.Scanner;

public class VivekLovesArrayGame {

	public static int MaxScore(int arr[], int start, int end) {
		if (start > end) {
			return 0;
		}
		int firstHalf = 0, secondHalf = 0;
		for (int i = start; i < end; i++) {
			int sum1 = Summation(arr, start, i);
			int sum2 = Summation(arr, i + 1, end);
			if (sum1 == sum2) {
				firstHalf = MaxScore(arr, start, i);
				secondHalf = MaxScore(arr, i + 1, end);
				return Math.max(firstHalf, secondHalf) + 1;
			}
		}
		return 0;
	}

	public static int Summation(int arr[], int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t != 0) {
			int n = scn.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			System.out.println(MaxScore(arr, 0, n-1));
			t--;
		}
	}

}
