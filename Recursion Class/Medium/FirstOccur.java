package Medium;

public class FirstOccur {

	public static int OccurenceFirst(int arr[], int vdx, int n) {
		if (arr[vdx] == n) {
			return vdx;
		}
		int sp = OccurenceFirst(arr, vdx + 1, n);
		return sp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 20, 40, 30, 80, 30 };
		System.out.println(OccurenceFirst(arr, 0, 30));
	}

}
