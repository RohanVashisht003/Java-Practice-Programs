package Practice_Recursion;

public class lastOccur {

	public static int Last(int arr[], int vdx, int data) {
		if (arr.length == vdx) {
			return -1;
		}
		int index = Last(arr, vdx + 1, data);
		if (index == -1 && arr[vdx] == data) {
			return vdx;
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 30, 40, 50, 30, 100, 30 };
		System.out.println(Last(arr, 0, 30));
	}

}
