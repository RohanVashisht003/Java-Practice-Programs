package Easy;

import java.util.Scanner;

public class UnionInterTwoSortedArrays {

	 public static void printIntersection(int a[], int b[]) 
	    { 
	        int max = Integer.MIN_VALUE;
	        int i = 0;
	        int j = 0;
	        while (i < a.length && j < b.length) {
	            if (a[i] < b[j]) {
	                i++;
	            } else if (a[i] > b[j]) {
	                j++;
	            } else {
	                if (a[i] > max) {
	                    max = a[i];
	                    System.out.print(a[i] + " ");  
	                }
	                if(a[i]==max){
	                    i++;
	                }
	            }
	        }
	    } 
	 public static void printUnion(int[] a, int[] b) {
	        int i = 0;
	        int j = 0;
	        int max = Integer.MIN_VALUE;
	        while (i < a.length && j < b.length) {
	            if (a[i] < b[j]) {
	                if (a[i] > max) {
	                    System.out.print(a[i] + " ");
	                    max = a[i];
	                }
	                i++;
	            } else if (a[i] > b[j]) {
	                if (b[j] > max) {
	                    System.out.print(b[j] + " ");
	                    max = b[j];
	                }
	                j++;
	            } else {
	                if (a[i] > max) {
	                    max = a[i];
	                    System.out.print(a[i] + " ");
	                }
	                i++;
	                j++;
	            }
	        }
	        while (i < a.length) {
	            if (a[i] > max) {
	                max = a[i];
	                System.out.print(a[i] + " ");
	                i++;
	            }
	            else{
	                i++;
	                j++;
	            }
	        }
	        while (j < b.length) {
	            if (b[j] > max) {
	                max = b[j];
	                System.out.print(b[j] + " ");
	                j++;
	            }
	            else{
	                i++;
	                j++;
	            }
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int arr1[] = new int[m];
		
		for(int i=0; i<m; i++) {
			arr1[i] = scn.nextInt();
		}
        int n = scn.nextInt();
        int arr2[] = new int[n];
		for(int i=0; i<n; i++) {
			arr2[i] = scn.nextInt();
		}
		printUnion(arr1, arr2);
        System.out.println();
        printIntersection(arr1,arr2);
	}

}
