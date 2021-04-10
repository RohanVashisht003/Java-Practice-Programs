package Practice_Recursion;

public class reverseArrayRecursion {

	public static void reverseDisplay(int arr[], int vidx) {
		if (vidx == arr.length) {
			return;
		}
		reverseDisplay(arr, vidx + 1);
		System.out.print(arr[vidx] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 80, 90, 30, 20, 10 };
		reverseDisplay(arr, 0);
	}

}
