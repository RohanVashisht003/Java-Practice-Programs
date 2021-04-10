package Medium;

import java.util.Scanner;

public class InverseOfArray {

	public static void Inverse(int arr[]) {
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[arr[i]] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		Inverse(arr);
	}

}
