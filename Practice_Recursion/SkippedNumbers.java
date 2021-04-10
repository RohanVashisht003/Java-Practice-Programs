package Practice_Recursion;

import java.util.Scanner;

public class SkippedNumbers {

	public static void Skipped(int n) {
		if(n==0) {
			return;
		}
		//working
		if(n%2!=0) {
			System.out.println(n);
		}
		//updation
		Skipped(n-1);
		//working
		if(n%2==0) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Skipped(n);
	}

}
