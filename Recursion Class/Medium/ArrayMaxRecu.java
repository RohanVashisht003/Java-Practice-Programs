package Medium;

public class ArrayMaxRecu {

	public static int Max(int arr[], int vdx) {

		if (vdx == arr.length) {
			return Integer.MIN_VALUE;
		}
		int sp = Max(arr, vdx + 1);
		int bp = Math.max(arr[vdx], sp);

		return bp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 20, 40, 70 };

		System.out.println(Max(arr, 0));
	}

}
