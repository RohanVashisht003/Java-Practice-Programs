package Basic;

import java.util.Scanner;

public class Factorial {

	public static int Factorial(int n) {
		//base case
		if(n==0) {
			return 1;
		}
		//updation
		int fnm1 = Factorial(n-1);
		//self work
		int f = fnm1*n;
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	
		System.out.println(	Factorial(n));
	}

}
