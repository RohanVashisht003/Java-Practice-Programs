import java.util.Scanner;
public class Rhombus {
	public static void main(String arg[])
	{
 Scanner scn=new Scanner(System.in);
 int n=scn.nextInt();
 int i,j;
    for( i=1;i<=n;i++)
    {
        for( j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
	    
		if(i==1 || i==n)
            for(j=1;j<=n;j++)
            {
            	System.out.print ("*");
            }
        else
	    {
            for(j=1;j<=n;j++)
            {  
                if(j==1 || j==n)
                	System.out.print("*");
                else
                	System.out.print(" ");
            }
        }
		System.out.println();
                       
  
}
	}
}

