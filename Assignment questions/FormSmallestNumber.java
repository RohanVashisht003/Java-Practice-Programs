package Hard;

import java.util.Scanner;

public class FormSmallestNumber {

	public static void Sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (Compare(arr[j], arr[j + 1]) > 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static int Compare(int n1, int n2) {
		String val1 = n1 + "" + n2;
		String val2 = n2 + "" + n1;

		int val1int = Integer.valueOf(val1);
		int val2int = Integer.valueOf(val2);
		
		if(val1int < val2int) {
			return -1;
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		Sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}

}
