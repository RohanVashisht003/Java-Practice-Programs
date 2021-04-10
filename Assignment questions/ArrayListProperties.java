package Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProperties {
	static Scanner scn = new Scanner(System.in);

	public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
		int i = 0;
		int m = arr1.length;
		int j = 0;
		int n = arr2.length;
		ArrayList<Integer> list = new ArrayList<>();
		while (i < m && j < n) {
			if (arr1[i] == arr2[j]) {
				list.add(arr1[i]);
				i++;
				j++;
			} else {
				if (arr1[i] < arr2[j]) {
					i++;
				} else {
					j++;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 60, 80 };
		int arr2[] = { 10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90 };
		System.out.println(intersection(arr1, arr2));

	}

}
