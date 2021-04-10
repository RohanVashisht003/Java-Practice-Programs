package Medium;

import java.util.*;

public class printSubset {

	public static void print_subSet(int[] arr, String ans, int i) {
		if (i == arr.length) {
			System.out.println(ans);
			return;
		}

		print_subSet(arr, ans + arr[i] + " ", i + 1);// yes
		print_subSet(arr, ans, i + 1);// no
	}

	public static void subSet_sum(int[] arr, int ans, int i, ArrayList<Integer> list) {
		if (i == arr.length) {
			// System.out.println(ans);
			list.add(ans);
			return;
		}

		subSet_sum(arr, ans + arr[i], i + 1, list);// yes
		subSet_sum(arr, ans, i + 1, list);// no
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		// print_subSet(arr, "", 0);
		subSet_sum(arr, 0, 0, list);
		Collections.sort(list);
		System.out.println(list);

	}

}
