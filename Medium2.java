package Basic_Lecture1;

import java.util.Scanner;

public class Medium2 {

	public static int Rainwater(int arr[]) {
		int lmax = arr[0];
		int rmax = arr[0];
		int lo = 0;
		int hi = arr.length - 1;
		int res=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[lo] < arr[hi]) {
				if(lmax<arr[lo]) {
					lmax=arr[lo];
				}
				else {
					res+=lmax-arr[lo];
				}
				lo++;
			}
			else {
				if(arr[lo]>arr[hi]) {
					if(rmax<arr[hi]) {
						rmax=arr[hi];
					}
					else {
						res+=rmax-arr[hi];
					}
				}
				hi--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t != 0) {
			int n = scn.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			int ans = Rainwater(arr);
			System.out.println(ans);
		}
	}

}
