package Hard;

import java.util.Scanner;
import java.util.*;

public class SmallestNumberUsingStack {

	public static void SmallestNumber(String str) {
		Stack<Integer> st = new Stack<>();
		int num = 1;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'D') {
				st.push(num);
				num++;
			} else {
				st.push(num);
				num++;

				while (st.size() > 0) {
					System.out.print(st.pop() + " ");
				}
			}
		}
		st.push(num);
		while (st.size() > 0) {
			System.out.print(st.pop() + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n;
		n = scn.nextInt();
		while (n > 0) {
			String str = scn.next();
			SmallestNumber(str);
			n--;
			System.out.println();
		}

	}
}
