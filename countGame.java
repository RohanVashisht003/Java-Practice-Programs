package ClassTest1;

import java.util.Scanner;

public class countGame {

	public static int Counting(int arr[], int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int times = arr[i] / k;
			int sum = 0;
			while (times > 0) {
				count++;
				sum += k;
				times--;
			}
			int last = arr[i] % k;
			if (last > 0) {
				count++;
				sum += k;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int ans = Counting(arr, k);
		System.out.print(ans);
	}

}
