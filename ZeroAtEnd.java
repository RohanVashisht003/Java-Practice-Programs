package Basic_Lecture1;

import java.util.Scanner;

public class ZeroAtEnd {

	public static void sort(int arr[]) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				arr[count++] = arr[i];
			}
		}
		while(count<arr.length) {
			arr[count++]= 0;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
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
		sort(arr);
	}

}
