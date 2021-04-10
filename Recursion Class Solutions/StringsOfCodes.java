package Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class StringsOfCodes {

	public static ArrayList<String> StringsOfCode(String str) {
		if (str.length() <= 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr1 = StringsOfCode(ros);
		ArrayList<String> mr = new ArrayList<>();

		char cvrt_ch = (char) (ch + 48);
		for (String val : rr1) {
			mr.add(cvrt_ch + val);
		}
		if (str.length() >= 2) {
			String ch2 = str.substring(0, 2);
			String ros2 = str.substring(2);
			if (Integer.parseInt(ch2) <= 26) {
				char cvrt_ch2 = (char) (Integer.parseInt(ch2) + 'a' - 1);
				ArrayList<String> rr2 = StringsOfCode(ros2);
				for (String val : rr2) {
					mr.add(cvrt_ch2 + val);
				}
			}
		}
		return mr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.print(StringsOfCode(str));
	}

}
