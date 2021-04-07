package Basic_Lecture1;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {

	public static void Roses(int arr[], int money) {
		int leftIndex = 0;
		int rightIndex = arr.length - 1;
		int leftFlower = 0;
		int rightFlower = 0;
		while (leftIndex < rightIndex) {
			int sum = arr[leftIndex] + arr[rightIndex];
			if (money < sum) {
				rightIndex--;
			} else if (money > sum) {
				leftIndex++;
			} else {
				leftFlower = arr[leftIndex];
				rightFlower = arr[rightIndex];
				leftIndex++;
				rightIndex--;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + leftFlower + " and " + rightFlower);
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
			int money = scn.nextInt();
			Arrays.sort(arr);
			Roses(arr, money);
			t--;
		}
	}

}
