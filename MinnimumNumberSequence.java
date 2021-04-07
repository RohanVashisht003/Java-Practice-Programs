package Basic_Lecture1;

import java.util.Scanner;

public class MinnimumNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int arr[] = new int[str.length() + 1];
		int count = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				arr[i] = count;
				count++;
			}
			for (int j = i - 1; j >= 0 && str.charAt(j) == 'D'; j--) {
				arr[j] = count;
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
