package Practice_Recursion;

public class ArraySorted {

	public static boolean Sorted(int n[], int vidx) {
		if (n.length - 1 == vidx) {
			return true;
		}
		if (n[vidx] > n[vidx + 1]) {
			return false;
		} else {
			boolean fans = Sorted(n, vidx + 1);
			return fans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 20 };
		System.out.println(Sorted(arr, 0));
	}

}
