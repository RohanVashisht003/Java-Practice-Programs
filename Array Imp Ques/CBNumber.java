import java.util.Scanner;

public class CBNumber {
	static int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

	public static boolean isSubstring(long n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isVisited(boolean[] visited, int si, int ei) {
		for (int i = si; i < ei; i++) {
			if (visited[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String str = scn.next();
		int count = 0;
		boolean[] visited = new boolean[n];
		for (int i = 1; i <= str.length(); i++) {
			for (int si = 0; si <= str.length() - i; si++) {
				int ei = si + i;
				String ans = str.substring(si, ei);
				if (isSubstring(Long.parseLong(ans)) && isVisited(visited, si, ei)) {
					count++;
					for (int k = si; k < ei; k++) {
						visited[i] = true;
					}
				}
			}
		}
		System.out.println(count);

	}

}
