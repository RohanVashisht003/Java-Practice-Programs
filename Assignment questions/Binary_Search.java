package Easy;

public class Binary_Search {

	public static int Binary_Search(int[] arr, int n) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if(n==arr[mid]) {
				return mid;
			}
			else if(n<arr[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,3,8,10 };
		System.out.println(Binary_Search(arr, 3));
	}

}
