package Basic_Lecture1;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if(ch>=65 && ch<=90) {
			System.out.print("UPPERCASE");
		}
		else if(ch>=97 && ch<=122) {
			System.out.print("lowercase");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
