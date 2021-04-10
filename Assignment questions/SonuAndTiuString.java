package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class SonuAndTiuString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int i;
		i = scn.nextInt();
		scn.nextLine();
		while (i > 0) {
			String sonu = scn.next();
			String titu = scn.next();
			Making_Anagram(sonu, titu);
			i--;
		}

	}

	public static void Making_Anagram(String sonu, String titu) {
		char sonuArr[] = sonu.toCharArray();
		Arrays.sort(sonuArr);
		char tituArr[] = titu.toCharArray();
		Arrays.sort(tituArr);

		if (sonuArr.length == 0 && tituArr.length > 0) {
			System.out.print(tituArr.length);
		} else if (sonuArr.length > 0 && tituArr.length == 0) {
			System.out.print(sonuArr.length);
		} else if ((Arrays.equals(sonuArr, tituArr)) || (sonuArr.length == 0 && tituArr.length == 0)) {
			System.out.print("0");
		} else {
			int count = 0;
			if (sonuArr.length <= tituArr.length) {
				for (int i = 0; i < sonuArr.length; i++) {
					for (int j = 0; j < tituArr.length; j++) {
						if (sonuArr[i] == tituArr[j]) {
							count += 2;
						}
					}
				}
			} else {
				for (int i = 0; i < tituArr.length; i++) {
					for (int j = 0; j < sonuArr.length; j++) {
						if (sonuArr[j] == tituArr[i]) {
							count += 2;
						}
					}
				}
			}
			System.out.print((sonuArr.length + tituArr.length) - count);
		}
	}
}
