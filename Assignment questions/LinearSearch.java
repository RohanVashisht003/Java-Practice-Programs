package Easy;

public class LinearSearch {

	public static int Linear_Search(int[] arr, int n) {
		for(int i=0; i<arr.length; i++) {
			if(n==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,8,9,1,7};
		System.out.println(Linear_Search(arr,40));
	}

}
