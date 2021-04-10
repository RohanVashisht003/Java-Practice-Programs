package Easy;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int n,m;
		while(t!=0) {
			int sumA=0,sumH=0,a=1;
			m = scn.nextInt();
			n = scn.nextInt();
			while(true) {
				sumA+=a++;
				if(sumA>m) {
					System.out.println("Harshit");
					break;
				}
				sumH+=a++;
				if(sumH>n) {
					System.out.println("Aayush");
					break;
				}
			}
			t--;
		}
	}

}
