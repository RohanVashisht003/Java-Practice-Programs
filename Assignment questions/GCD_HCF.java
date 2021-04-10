package Easy;

import java.util.Scanner;

public class GCD_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int count = Math.min(n1, n2);
		while(count>=1) {
			if(n1%count==0 && n2%count==0) {
				System.out.println(count);
				break;
			}
			count-=1;
		}
	}

}
