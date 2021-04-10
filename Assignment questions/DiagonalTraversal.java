package Medium;

import java.util.*;

public class DiagonalTraversal {
	static final int MAX = 100; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		DiagonalPrint(a, m, n);
	}

	public static void DiagonalPrint(int[][] a, int m, int n) {
		int i = 0, j = 0;
		boolean IsUpward = true;
		for(int k=0; k<m*n;) {
			if (IsUpward) {
				for (; i >= 0 && j < n; j++, i--) {
					System.out.print(a[i][j] + " ");
					k++;
				}
				if (i < 0 && j < n) {
					i = 0;
				}
				if (j == n) {
					j--;
					i = i + 2;
				}
			} else {
				for (; j >= 0 && j < n; i++, j--) {
					System.out.print(a[i][j] + " ");
					k++;
				}
				if (j < 0 && i < m) {
					j = 0;
				}
				if (i == m) {
					j = j + 2;
					i--;
				}
			}
			IsUpward = !IsUpward;
		}

	}
}
