package Easy;

import java.util.*;

public class LongestKUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		scn.nextLine();
		while (t-- > 0) {
			String str = scn.next();
			int k = scn.nextInt();
			System.out.println(FindKUnique(str, k));
		}

	}

	public static int FindKUnique(String str, int k) {
		// TODO Auto-generated method stub
		int ans = 0;
		int i = 0;
		int j = 0;
		int dis=0;
		int freq[] = new int [26];
		while(j<str.length()) {
		char ch = str.charAt(j);
			if(freq[ch-97]==0) {
				dis++;
			}
			freq[ch-97]++;
			
			while(dis>k) {
				ch = str.charAt(i);
				freq[ch-97]--;
				if(freq[ch-97]==0) {
					dis--;
				}
				i++;
			}
			ans = Math.max(ans, j-i+1);
			j++;
		}
        if(ans<k)
		return -1;
        else
        return ans;
	}
}