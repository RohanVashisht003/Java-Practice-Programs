package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class LeadersInArray {

	public static void Leaders(int arr[]) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			int j;
			for(j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					break;
				}
			}
			if(j==arr.length) {
				System.out.println(arr[i]+" ");
			}
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
		Leaders(arr);
	}

}
