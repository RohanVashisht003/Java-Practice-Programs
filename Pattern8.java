import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp=n/2;
		int nst=1;
//rows
		for(int i=1; i<=n; i++)
		{
//spaces			
		for(int j=1; j<=nsp; j++) {
				System.out.print(" ");
			}
//stars			
		for(int k=1;k<=nst; k++)
		{
			System.out.print("*");
		}
		
//preperation		
		System.out.println();
		if(i<=n/2)
		{
			nst=nst+2;
			nsp--;
		}
		else
		{
			nsp++;
			nst=nst-2;
		}

	}

	}
}
