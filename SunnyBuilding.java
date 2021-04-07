package Basic_Lecture1;

import java.util.Scanner;

public class SunnyBuilding {

	public static void Buildings(int arr[]) {
		int count=1;
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==max || arr[i]>max) {
				count++;
				max = arr[i];
			}
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			Buildings(arr);
			t--;
		}
	}

}
