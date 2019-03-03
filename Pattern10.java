import java.util.*;
public class Pattern10 {

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
			for(int j=1; j<=nst; j++)
			{
				System.out.print(val);
			}
			System.out.println();
			nsp--;
			nst=nst+2;
			val++;
		}

	}

}
