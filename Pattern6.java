import java.util.*;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		int nr=n*2-1;
//rows	
		for(int i=1; i<=nr; i++)
		{
//stars			
			for(int j=1; j<=nst; j++)
			{
				System.out.print("*");
			}
//preperation
			System.out.println();
			if(i<=nr/2)
			{
				nst=nst+2;
			}
			else
			{
				nst=nst-2;
			}
		}

	}

}
