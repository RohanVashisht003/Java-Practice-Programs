import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		char alp='A';
		System.out.println("Enter Character in upper case");
		Scanner scan=new Scanner(System.in);
		char n=scan.next().charAt(0);
		scan.close();
		int i,j;
		for(i=1; i<(n-'A'+2); i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(alp);
			}
			++alp;
			
				System.out.println(" ");
				}
		}
	}


