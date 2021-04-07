package Basic_Lecture1;

import java.util.Scanner;

public class Easy2 {
	public static void reverse(int arr[]) {
		int n = arr.length-1;
		for(int i=0; i<=n/2; i++) {
			int tep = arr[n-i];
			arr[n-i] = arr[i];
			arr[i] = tep;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		reverse(arr);
	}

}
