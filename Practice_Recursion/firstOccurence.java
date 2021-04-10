package Practice_Recursion;

public class firstOccurence {

	public static int First(int arr[], int vidx, int data) {
		if(vidx==arr.length) {
			return -1;
		}
		if (arr[vidx] == data) {
			return vidx;
		}
		else {
		int sp = First(arr, vidx + 1, data);
		return sp;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 5, 3 };
		int ans = First(arr, 0, 3);
		System.out.println(ans);
	}

}
