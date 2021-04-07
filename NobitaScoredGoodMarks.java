package Basic_Lecture1;

import java.util.Scanner;

public class NobitaScoredGoodMarks {

	public static void Nobita(int candy, int student) {
		if (candy % student == 0) {
			System.out.println("0");
		} else {
			int ans = candy / student;
			int returnCandy = candy % student;
			int moreCandyRequire = (ans + 1) * (student) - candy;
			System.out.println(Math.min(returnCandy, moreCandyRequire));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t != 0) {
			int candy = scn.nextInt();
			int student = scn.nextInt();
			Nobita(candy, student);
			t--;
		}
	}

}
