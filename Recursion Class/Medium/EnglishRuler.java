package Medium;

import java.util.Scanner;

public class EnglishRuler {

	public static void Pattern(int mtl) {
		if (mtl == 0) {
			return;
		}
		Pattern(mtl - 1);
		for (int i = 1; i <= mtl; i++)
			System.out.print("- ");
		System.out.println();
		Pattern(mtl - 1);
	}

	public static void EnglishRuler(int inch, int mtl) {

		for (int i = 1; i <= mtl; i++)
			System.out.print("- ");
		System.out.println("0");
		for (int i = 1; i <= inch; i++) {
			Pattern(mtl - 1);
			for (int j = 1; j <= mtl; j++)
				System.out.print("- ");
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int inch = scn.nextInt();
		int mtl = scn.nextInt();
		EnglishRuler(inch, mtl);
	}

}
