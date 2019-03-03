import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp=n-1;
		int nst=1;
		int val=1;
//rows
		for(int i=1; i<=n; i++)
		{
//space
			for(int j=1; j<=nsp; j++)
			{
				System.out.print(" ");
			}
//star
			for(int k=1; k<=nst; k++)
			{
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
			nsp--;
			nst=nst+2;
		}

	}

}
