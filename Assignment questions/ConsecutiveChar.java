package Easy;

import java.util.Scanner;

public class ConsecutiveChar {

	public static void consecutive(String str, int n) {
		int count=0;
		int maxcount=0;
		char prev=' ';
		for(int i=0; i<n; i++) {
			char ch = str.charAt(i);
			if(ch==prev) {
				count++;
			}
			else {
				count = 1;
				prev = ch;
			}
			maxcount = Math.max(maxcount,count);
		}
		System.out.println(maxcount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		consecutive(str,str.length());
	}

}
