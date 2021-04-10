import java.util.Scanner;

public class TrailingZero {

	public static void TrailingZeroes(int n) {
		int count=0;
		for(int i=5; n/i>=1; i*=5) {
			count +=n/i;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		TrailingZeroes(n);
	}

}
