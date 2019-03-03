import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp=2*n-2;
		int nst=1;
//rows
		for(int i=1; i<=n; i++)
		{
//stars			
		for(int j=1; j<=nst; j++) {
				System.out.print("*");
			}
//space			
		for(int k=1;k<=nsp; k++)
		{
			System.out.print(" ");
		}
//stars		
		for(int j=1; j<=nst; j++) {
			System.out.print("*");
		}
		
		
//preperation		
		System.out.println();
		nst++;
		nsp=nsp-2;
		}
	}
	}


