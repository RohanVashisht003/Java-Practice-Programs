package Easy;

import java.util.Scanner;

public class Rotate_Till {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		int num = n;
		int rem;
		int quo;
		int nod=0;
		while(n!=0) {
			n=n/10;
			nod++;
		}
		r = r%nod;
		int divisor = (int)(Math.pow(10,r));
		int pow = (int)(Math.pow(10,nod-r));
		rem = num%divisor;
		quo = (int)(num/divisor);
		
		int ans =(rem*pow)+quo;
		System.out.println(ans);
	}

}
