package Basic;

import java.util.Scanner;

public class power {

	public static int power2(int x, int n) {
		if(n==0) {
			return 1;
		}
		int sp = power2(x,n/2);
		int bp;
		if(x%2==0) {
			bp = sp*sp;
		}
		else {
			bp = sp*sp*x;
		}
		return bp;
	}
	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int p1 = power(x,n-1);
		int p2 = x*p1;
		return p2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(power(x,n));
	}

}
