package Basic_Lecture1;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermu {

	public static void display(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void reverse(int arr[], int start) {
		int end = arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}

	public static void Permu(int arr[]) {
		int number_index = 0;
		int i = arr.length - 2;
		while (i >= 0 && arr[i + 1] <= arr[i]) {
			i--;
		}
		int j = arr.length - 1;
		if (i >= 0) {
			while (j >= 0 && arr[j] < arr[i]) {
				j--;
			}
			swap(arr, i, j);
		}
		reverse(arr, i + 1);
		display(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		Permu(arr);
	}

}
