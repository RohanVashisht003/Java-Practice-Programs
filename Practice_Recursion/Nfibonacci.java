package Practice_Recursion;

import java.util.Scanner;

public class Nfibonacci {

	public static int Nthfib(int n) {
		if(n==1 || n==0) {
			return n;
		}
		int fnm1 = Nthfib(n-1);
		int fnm2 = Nthfib(n-2);
		int fn = fnm1+fnm2;
		return fn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println((n));
	}

}
