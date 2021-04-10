package Medium;

import java.util.Scanner;

public class InverseTricky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int pos = 1;
		int power;
		int ans=0;
		while(num!=0) {
			int rem = num%10;
			power = (int)(Math.pow(10,rem-1));
			ans += (pos*power);
			num=num/10;
			pos=pos+1;
		}
		System.out.println(ans);
		
	}

}
