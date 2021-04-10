package Easy;

import java.util.Scanner;

public class PythagorasTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		if (a > 2) {
			if (a % 2 == 0) {
				long var = (a * a / 4);
				System.out.print((var - 1) + " " + (var + 1));
			} else if (a % 2 != 0) {
				long var = a * a +1;
				System.out.print((var/2 - 1) + " " + (var/2));
			}
		} else {
			System.out.println("-1");
		}

	}
}