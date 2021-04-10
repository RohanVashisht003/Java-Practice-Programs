package Easy;

import java.util.Scanner;

public class Polynomial {

	public static void polynomial(int x, int n) {
	
		int mul=x,ans=0;
		for(int i=n; i>=1; i--) {
			ans+=i*mul;
			mul*=x;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		polynomial(x, n);
	}

}
