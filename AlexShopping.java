package Basic_Lecture1;

import java.util.Scanner;

public class AlexShopping {

	public static boolean Shopping(int arr[], int A, int k) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(A%arr[i]==0) {
				count++;
			}
		}
		if(count>=k) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int price[] = new int[n];
		for (int i = 0; i < n; i++) {
			price[i] = scn.nextInt();
		}
		int q =scn.nextInt();
		while(q!=0) {
			int A = scn.nextInt();
			int k = scn.nextInt();
			if(Shopping(price, A,k)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			q--;
		}
	}

}
