package Medium;

import java.util.Scanner;

public class CalculateTheSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
		int q = scn.nextInt();
		int sum = 0;
		int[] res = new int[arr.length];
		while (q != 0) {
			int x = scn.nextInt();
			for (int i = 0; i < res.length; i++) {
				int temp = i - x;
				if (temp < 0)
					temp = arr.length + temp;
				res[i] = arr[i] + arr[temp];
			}
			for (int i = 0; i < arr.length; i++)
				arr[i] = res[i];
			q--;
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		sum = sum % ((int) Math.pow(10, 9) + 7);
		System.out.println(sum);
	}

}
