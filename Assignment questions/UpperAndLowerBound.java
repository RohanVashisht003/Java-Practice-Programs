package Easy;

import java.util.Scanner;

public class UpperAndLowerBound {

	public static int LowerBound(int[] arr, int num) {
		int low = 0, high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == num) {
				ans = mid;
				low = mid + 1;
			} else if (num < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static int UpperBound(int[] arr, int num) {
		int low=0,ans=-1;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]<num) {
				ans = mid;
				high = mid-1;
			}
			else if(num<arr[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,3,4};
		
		System.out.println(LowerBound(arr, 2));
		System.out.println(UpperBound(arr, 3));
	}
}
