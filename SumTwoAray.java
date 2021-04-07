package Basic_Lecture1;

import java.util.ArrayList;
import java.util.Scanner;

public class SumTwoAray {

	public static ArrayList<Integer> Addition(int arr1[], int arr2[]) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int carry = 0;
		int sum = 0;
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		while (i >= 0 || j >= 0) {
			sum = carry;
			if (i >= 0) {
				sum += arr1[i];
			}
			if (j >= 0) {
				sum += arr2[j];
			}
			int rem = sum % 10;
			res.add(0, rem);
			carry = sum / 10;
			i--;
			j--;

		}
		if (carry > 0) {
			res.add(0, carry);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a1 = scn.nextInt();
		int a2 = scn.nextInt();
		int arr1[] = new int[a1];
		int arr2[] = new int[a2];

		for (int i = 0; i < a1; i++) {
			arr1[i] = scn.nextInt();
		}
		for (int i = 0; i < a2; i++) {
			arr2[i] = scn.nextInt();
		}
		ArrayList<Integer> res = Addition(arr1, arr2);
		System.out.println(res);
	}

}
