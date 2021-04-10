import java.util.*;

public class FirstBadVersion {

	public static int BadVersion(int n, int bad) {
		int left = 1;
		int right = n;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (mid == bad) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int bad = scn.nextInt();
		System.out.println(BadVersion(n, bad));

	}

}
