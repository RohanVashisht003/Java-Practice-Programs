package Basic;

import java.util.Scanner;

public class PrintCountReverse {

	public static void RecursiveCounting(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		RecursiveCounting(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		RecursiveCounting(n);
	}

}
