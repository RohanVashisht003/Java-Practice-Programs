import java.util.Scanner;

public class BuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		BuyAndSell(arr, n);
	}

	public static void BuyAndSell(int arr[], int n) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minPrice) {
				minPrice = arr[i];
			} else if (arr[i] - minPrice > maxProfit) {
				maxProfit = arr[i] - minPrice;
			}
		}
		System.out.print(maxProfit);
	}

}
