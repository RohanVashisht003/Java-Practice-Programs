package Practice_Recursion;

public class AllOccur {

	public static int[] AllOccur(int arr[], int n, int vidx, int count) {
		if (vidx == arr.length) {
			int arr2[] = new int[count];
			return arr2;
		}
		if (arr[vidx] == n) {
			int rr[] = AllOccur(arr, n, vidx + 1, count + 1);
			rr[count] = vidx;
			return rr;
		} else {
			int rr[] = AllOccur(arr, n, vidx + 1, count);
			return rr;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 30, 50, 80, 90, 10, 10 };
		int ans[]=AllOccur(arr, 10, 0, 0);
for(int i=0; i<ans.length; i++) {
	System.out.println(ans[i]);
}
	}

}
