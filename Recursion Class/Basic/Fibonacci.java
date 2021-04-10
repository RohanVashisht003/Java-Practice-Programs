package Basic;

import java.util.Scanner;

public class Fibonacci {

	public static int fibo(int n) {
		if(n==1 || n==0) {
			return n;
		}
		int f1 = fibo(n-1);
		int f2 = fibo(n-2);
		return f1+f2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		System.out.println(fibo(n));
	}

}
