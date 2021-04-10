package Easy;

import java.util.Scanner;

public class LongestCommomPrefix {

	public static String LCP(String[] strs) {
		if(strs==null || strs.length==0) {
			return "";
		}
		
		String lcp = strs[0];
		for(int i=0; i<strs.length; i++) {
			String currentWord = strs[i];
			int j=0;
			while(j<currentWord.length() && j<lcp.length() && currentWord.charAt(j)==lcp.charAt(j)) {
				j++;
			}
			if(j==0) {
				return "";
			}
			lcp  = 	currentWord.substring(0,j);
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
		String str = LCP(arr);
		System.out.println(str);
	}

}
