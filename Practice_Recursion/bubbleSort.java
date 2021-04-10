package Practice_Recursion;

public class bubbleSort {

	public static void bubbleSort(int arr[], int si, int li) {
		if (li == 0) {
			return;
		}
		if (si == li) {
			bubbleSort(arr, 0, li - 1);
			return;
		}
		if (arr[si] > arr[si + 1]) {
			int temp = arr[si];
			arr[si] = arr[si+1];
			arr[si+1] = temp;
		}
		bubbleSort(arr, si + 1, li);
	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,50,40,20,10};
		bubbleSort(arr, 0, arr.length - 1);
		display(arr);
	}

}
