package Basic_Lecture1;

import java.util.Scanner;

public class InverseOfArray {

	public static void InverseOfArray(int arr[]) {
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			arr2[num] = i;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();
		}
		InverseOfArray(arr);
	}

}
