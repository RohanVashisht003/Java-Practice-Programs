package Basic_Lecture1;

import java.util.Arrays;
import java.util.Scanner;

public class MinnimumSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		
		int i=0;
        int swap=0;
        while(i<arr.length)
        {
            if(arr[i]==i+1)
            i++;
            else
            {
                int temp=arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
                swap++;
            }
        }
        System.out.println(swap);
	}

}
