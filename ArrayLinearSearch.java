package Basic_Lecture1;

import java.util.Scanner;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int price[] = new int[n];
		for (int i = 0; i < n; i++) {
			price[i] = scn.nextInt();
		}
		int number = scn.nextInt();
		for(int i=0; i<price.length; i++) {
			if(price[i]==number) {
				System.out.println(i);
				break;
			}
		}
	}

}
