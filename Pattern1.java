import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		int i,j,n;
		System.out.println("Enter limit");
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	scan.close();
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=i; ++j)
		{
			System.out.print(j);
		}
		System.out.println(" ");
	}

	}
	

}
