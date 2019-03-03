import java.util.*;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=n/2;
		int nsp=1;
//rows		
		for(int i=1; i<=n; i++)
		{
//stars			
		for(int j=1; j<=nst; j++)
		{
		System.out.print("*");	
		}
//spaces		
		for(int k=1; k<=nsp; k++)
		{
			System.out.print(" ");
		}
//stars	
		for(int j=1; j<=nst; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		if(i<=n/2)
		{
			nsp=nsp+2;
			nst=nst-1;
		}
		else
		{
			nsp=nsp-2;
			nst=nst+1;
		}
		}
	}

}
