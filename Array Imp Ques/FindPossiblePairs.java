import java.util.Scanner;

public class FindPossiblePairs {

	public static int gcd(int p, int l) {
		int divident = p;
		int divisor = l;
		
		while(divident%divisor!=0) {
			int rem = divident%divisor;
			divident = divisor;
			divisor = rem;
		}
		return divisor;
	}

	public static int countPair(int g, int l) {
		int p = g * l;
		int count = 0;
		for (int i = 1; i <= l; i++) {
			if (p % i == 0 && gcd(p / i, i) == g) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int g = scn.nextInt();
		int l = scn.nextInt();
		System.out.print(countPair(g, l));
		
	}

}
