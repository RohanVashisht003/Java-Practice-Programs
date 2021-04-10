package Easy;

import java.util.Scanner;

public class SumofNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int i = scn.nextInt();
		scn.nextLine();
		while (i > 0) {
			String str = scn.next();
			System.out.print(CalculateSum(str));
			i--;
		}
	}

	public static int CalculateSum(String s) {
		int l = s.length();
	    int sum = 0;
	    String temp = "0";
	    
	    for(int i=0;i<l;i++)
	    {
	        char c = s.charAt(i);
	        if(Character.isDigit(c))
	        {
	            temp = temp+c;
	        }
	        else
	        {
	            sum = sum+Integer.parseInt(temp);
	            temp = "0";
	        }
	        
	    }
	    return sum+Integer.parseInt(temp);
	}

}
