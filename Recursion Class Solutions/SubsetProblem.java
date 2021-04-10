package Medium;

import java.util.Scanner;

public class SubsetProblem {
	static int cnt = 0;

	public static void SubsetRecursion(int arr[], int subset, String ans, int vidx, int target) {
		if (vidx == arr.length) {
			if (target == subset) {
				cnt++;
				System.out.print(ans + " ");
				return;
			}

			return;
		}
		SubsetRecursion(arr, subset + arr[vidx], ans + arr[vidx] + " ", vidx + 1, target);
		SubsetRecursion(arr, subset, ans, vidx + 1, target);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		SubsetRecursion(arr, 0, "", 0, target);
		System.out.println();
		System.out.println(cnt);
	}

}
