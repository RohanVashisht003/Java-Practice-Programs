import java.util.*;

public class KartikBhaiyaString {

	public static int KartikBhaiya(String str, int k, char c) {
		int ans = 0;
		int count = 0;
		int i = 0, j = 0;
		while (j < str.length()) {
			if (str.charAt(j) == c) {
				count++;
			}
			while (count > k) {
				if (str.charAt(i) == c) {
					count--;
				}
				i++;
			}
			ans = Math.max(ans, j - i + 1);
			j++;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();
		System.out.print(Math.max(KartikBhaiya(str, k, 'a'), KartikBhaiya(str, k, 'b')));
	}

}
