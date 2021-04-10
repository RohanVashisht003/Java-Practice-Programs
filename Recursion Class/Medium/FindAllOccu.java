package Medium;

public class FindAllOccu {

	public static int[] AllIndx(int arr[], int vdx, int count, int n) {
		if (vdx == arr.length) {
			int arr2[] = new int[count];
			return arr2;
		}
		if (arr[vdx] == n) {
			int[] rr = AllIndx(arr, vdx + 1, count + 1, n);
			rr[count] = vdx;
			return rr;
		} else {
			int[] rr = AllIndx(arr, vdx + 1,count, n);
			return rr;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 40, 30, 20 };
		
		int ans[] = AllIndx(arr, 0, 0, 20);
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
