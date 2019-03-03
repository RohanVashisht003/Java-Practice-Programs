import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		int i,j,n;
System.out.println("Enter limit");
Scanner scan =new Scanner(System.in);
n=scan.nextInt();
for(i=n; i>=1; --i)
{
	for(j=1; j<=i; ++j)
	{
		System.out.print(j );
	}
	System.out.println(" ");
    }

	}

}
