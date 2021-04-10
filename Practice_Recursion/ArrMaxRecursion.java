package Practice_Recursion;

public class ArrMaxRecursion {

	public static int Max(int arr[], int vidx) {
		if (vidx == arr.length) {
			return Integer.MIN_VALUE;
		}
		int n = Max(arr, vidx + 1);
		if (arr[vidx] > n) {
			n = arr[vidx];
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 5, 6, 9, 40 ,-1,90};
		int ans = Max(arr, 0);
		System.out.println(ans);
	}

}
