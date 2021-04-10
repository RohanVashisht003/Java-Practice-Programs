package Medium;

import java.util.Scanner;

public class RainWaterTrapping {
	public static int RainWater(int arr[]) {
		int result = 0, lmax = 0, rmax = 0;
		int n = arr.length;
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi) {
			if(arr[lo]<arr[hi]) {
				if(arr[lo]>lmax) {
					lmax  = arr[lo];
				}
				else {
					result+=lmax-arr[lo];
			}
				lo++;
			}
			else {
				if(arr[hi]>rmax) {
					rmax = arr[hi];
				}
				else {
					result+=rmax-arr[hi];
				}
				hi--;
			}
		}
		return result;
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
			int ans = RainWater(arr);
			System.out.println(ans);
			t--;
		}
	}

}
