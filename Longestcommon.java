package Basic_Lecture1;

import java.util.Scanner;

public class Longestcommon {

	public static String LCP(String arr[]) {
		if(arr.length==0 || arr==null) {
			return "";
		}
		String lcp = arr[0];
		for(int i=0; i<arr.length; i++) {
			String currentWord = arr[i];
			int j=0;
			while(j<currentWord.length() && j<lcp.length() && lcp.charAt(j)==currentWord.charAt(j)) {
				j++;
			}
			if(j==0) {
				return "";
			}
			lcp = currentWord.substring(0,j);
		}
		return lcp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String arr[] = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = scn.next();
		}
		String ans = LCP(arr);
		System.out.println(ans);
	}

}
