package Basic_Lecture1;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		int q = scn.nextInt();
		int ans[] = new int[arr.length];
		while (q != 0) {
			int x = scn.nextInt();
			int temp;
			for (int i = 0; i < arr.length; i++) {
				temp = i - x;
				if (temp < 0) {
					temp = temp + arr.length;
				}
				ans[i] = arr[i] + arr[temp];
			}
			for(int i=0; i<arr.length; i++) {
				arr[i] = ans[i];
			}
			q--;
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		sum = sum % ((int) Math.pow(10, 9) + 7);
		System.out.println(sum);
	}

}
