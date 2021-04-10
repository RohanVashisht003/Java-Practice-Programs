package Medium;

import java.util.*;

public class MinnimumSwaps {

	public static int SwapCalculate(int[] arr) {
		int counter = 0;
		int n = arr.length;
		int i = 0;
		while (i < n) {
			if (arr[i] != i + 1) {
				while (arr[i] != i + 1) {
					int temp = 0;
					temp = arr[arr[i] - 1];
					arr[arr[i] - 1] = arr[i];
					arr[i] = temp;
					counter++;
				}
			}
			i++;
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(SwapCalculate(arr));
	}

}
