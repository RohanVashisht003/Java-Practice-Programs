import java.util.*;
public class Pattern5 {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int nsp=0;
	int nst=n;
//rows	
for(int i=1; i<=n; i++)
{
//spaces	
	for(int j= 1; j<=nsp; j++)
	{
		System.out.print(" ");
	}
 //stars  
	for(int j=1; j<=nst; j++ )
	{
		System.out.print("*");
     }
	//preperation
nsp++;
nst--;
System.out.println();
}
	}

}
