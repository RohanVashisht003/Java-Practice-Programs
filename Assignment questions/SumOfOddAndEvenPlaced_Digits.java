package Medium;

import java.util.Scanner;

public class SumOfOddAndEvenPlaced_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int odd=0,even=0,rem,counter=1;
		while(n!=0) {
			rem = n%10;
			if(counter%2==0) {
				even+=rem;
			}
			else {
				odd+=rem;
			}
			n/=10;
			counter++;
		}
		System.out.println(odd);
		System.out.println(even);
	}

}
