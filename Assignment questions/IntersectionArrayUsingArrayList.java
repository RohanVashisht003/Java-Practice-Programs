package Medium;

import java.util.*;

public class IntersectionArrayUsingArrayList {

	public static void Intersection(int arr1[], int arr2[], int m) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int k = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (arr1[i] == arr2[j]) {
					arr.add(k);
					k++;
					arr2[j] = -10000;
					break;
				}
			}
		}
		Collections.sort(arr);
		System.out.print(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();

		int arr1[] = new int[m];
		int arr2[] = new int[m];
		for (int i = 0; i < m; i++) {
			arr1[i] = scn.nextInt();
		}
		for (int i = 0; i < m; i++) {
			arr2[i] = scn.nextInt();
		}
		Intersection(arr1, arr2, m);
	}

}
