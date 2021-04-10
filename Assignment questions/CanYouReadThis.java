package Medium;

import java.util.Scanner;

public class CanYouReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		for (int i = 0; i < str.length(); i++) {
			if (i != 0 && Character.isUpperCase(str.charAt(i))) {
				System.out.println();
			}
			System.out.print(str.charAt(i));
		}
	}

}
