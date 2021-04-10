package Easy;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		float d = (b * b) - 4 * a * c;
		float sqrt = (float) Math.sqrt(d);
		int r1, r2;
		if (d == 0) {
			r1 = (int) (-b - sqrt) / (2 * a);
			System.out.println("Real and Equal");
			System.out.println(r1 + " " + r1);
		} else if (d > 0) {
			r1 = (int) (-b - sqrt) / (2 * a);
			r2 = (int) (-b + sqrt) / (2 * a);
			System.out.println("Real and Distinct");
			System.out.println(r1 + " " + r2);
		} else {
			System.out.println("Imaginary");
		}
	}

}
