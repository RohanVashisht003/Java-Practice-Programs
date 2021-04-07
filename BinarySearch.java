package Basic_Lecture1;

import java.util.Scanner;

public class BinarySearch {

	public static void BinarySearching(int arr[], int n) {
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid]<n) {
				lo = mid+1;
			}
			else if(arr[mid]==arr[lo]) {
				System.out.println(mid);
				return;
			}
			else {
				hi = mid-1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = {1,9,12,19,21,32,45,54,89,101};
		BinarySearching(arr, n);
	}

}
