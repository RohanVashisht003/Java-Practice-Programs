package Medium;

import java.util.Scanner;

public class AlexShopping {

	public static boolean Query(int arr[], int A, int k) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (A % arr[i] == 0) {
				cnt++;
			}
		}
		if (cnt >= k) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// no. of commodities
		int n = scn.nextInt();
		int[] arr = new int[n];

//		price of each commodity
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int q = scn.nextInt();
		while (q > 0) {
			int A = scn.nextInt();
			int k = scn.nextInt();

			if (Query(arr, A, k)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			q--;
		}
	}

}
