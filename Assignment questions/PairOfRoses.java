package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t>0) {
			int[] arr = new int[10000];
			int lflower = 0;
			int rflower = 0;

			int nr = scn.nextInt();

			for (int i = 0; i < nr; i++) {
				arr[i] = scn.nextInt();
			}
			Arrays.sort(arr);
			int leftIndex = 0;
			int rightIndex = arr.length - 1;
			int money = scn.nextInt();

			while (leftIndex < rightIndex) {
				int sum = arr[leftIndex] + arr[rightIndex];
				if (sum > money) {
					rightIndex--;
				} else if (sum < money) {
					leftIndex++;
				} else {
					lflower = arr[leftIndex];
					rflower = arr[rightIndex];
					leftIndex++;
					rightIndex--;
				}
			}
			System.out.println("Deepak should buy roses whose prices are " + lflower + " and " + rflower + ".");
			t--;
		}
	}
}
