package Medium;

public class LastOccur {

	public static int Occurencelast(int arr[], int vdx, int n) {
		if (vdx == arr.length) {
			return -1;
		}
		int index = Occurencelast(arr, vdx + 1, n);
		if (index == -1 && arr[vdx] == n) {
			return vdx;
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 30, 40, 50, 30,100,30 };

		System.out.println(Occurencelast(arr, 0, 30));
	}

}
