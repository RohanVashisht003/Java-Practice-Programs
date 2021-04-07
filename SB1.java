package Basic_Lecture1;

import java.util.Scanner;

public class SB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		sb.append("Hi");
		System.out.println(sb);
//		sb.insert(8, "rohan");
//		sb.deleteCharAt(2);
//		System.out.println(sb);
		
		String s  = sb.toString();
		System.out.println(s.endsWith("i"));
	}

}
