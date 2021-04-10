package Medium;

import java.util.Scanner;

public class StringRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String st = scn.next();
		Removal(st);
	}

	public static void Removal(String str) {
		String ans = "";
		char prev = ' ';
		for(int i=0; i<str.length(); i++) {
			if(prev!=str.charAt(i)) {
				ans+=str.charAt(i);
				prev=str.charAt(i);
			}
		}
		System.out.print(ans);
		
	}

}
