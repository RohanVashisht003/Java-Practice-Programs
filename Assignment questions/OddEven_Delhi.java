package Easy;

import java.util.Scanner;

public class OddEven_Delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		while (i < n) {
			int num = scn.nextInt();
			int even = 0, odd = 0, rem = 0;
			while (num != 0) {
				rem = num % 10;
				if (rem % 2 == 0) {
					even = even + rem;
				} else {
					odd = odd + rem;
				}
				num /= 10;
			}
			if (even % 4 == 0 || odd % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			i++;
			even++;
			odd++;
		}
	}

}
