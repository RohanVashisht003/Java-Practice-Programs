import java.util.Scanner;

public class ArrayProductExceptSelf {
	static Scanner scn = new Scanner(System.in);

	public static void Display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void ProductOfArray(int arr[], int n) {
		int left[] = new int[n];
		int right[] = new int[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		right[n - 1] = 1;
		for (int i = arr.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < arr.length; i++) {
			right[i] = left[i] * right[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(left[i] + " ");
		}
	}

	public static void Input(int n) {
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		ProductOfArray(arr, n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		Input(n);

	}
}
