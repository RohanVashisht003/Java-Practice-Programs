package Basic_Lecture1;

import java.util.Scanner;

public class MaxFrequency {

	public static char MaxFreq(String str) {
		int i = 0;
		int freq[] = new int[256];
		while (i < str.length()) {
			freq[str.charAt(i)]++;
			i++;
		}
		int j = 0;
		int max = Integer.MIN_VALUE;
		char ans = ' ';
		while (j < str.length()) {
			if(max<freq[str.charAt(j)]) {
			max = freq[str.charAt(j)];
			ans = str.charAt(j);
			}
			j++;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char ch = MaxFreq(str);
		System.out.print(ch);
	}

}
