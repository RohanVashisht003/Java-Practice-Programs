package Medium;

import java.util.Scanner;

public class AnyToDecimal {

	public static int Conversion(int n, int sb) {
		int ans = 0;
		int base = 1;
		while (n != 0) {
			int rem = n % 10;
			ans=ans+rem*base;
			base = base*sb;
			n/=10;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sb = scn.nextInt();
		int a = Conversion(n,sb);
		System.out.println(a);
	}

}
