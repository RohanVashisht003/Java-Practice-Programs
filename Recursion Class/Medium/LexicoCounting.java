package Medium;

import java.util.Scanner;

public class LexicoCounting {

	public static void LexicoCounting(int n, int curr) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		while(i<=9) {
			LexicoCounting(n, curr*10+i);
			i++;
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		LexicoCounting(n, 0);
	}

}
