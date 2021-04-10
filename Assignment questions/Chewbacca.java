package Easy;

import java.util.Scanner;

public class Chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long x = scn.nextLong();
		int y;
		long rem,ans=0,count=1;
		while(x!=0) {
			rem = x%10;
			if(rem>=5) {
				if(rem==9 && (x/10)==0) {
					//nothing
				}
				else {
					rem=9-rem;
				}
			}
			ans = ans+(count*rem);
			count*=10;
			x/=10;
		}
		System.out.println(ans);
	}

}
