import java.util.Scanner;

public class GasProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int gas[] = new int[n];
		int cost[] = new int[n];
		for (int i = 0; i < n; i++) {
			gas[i] = scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			cost[i] = scn.nextInt();
		}
		System.out.print(GasStation(gas, cost));
	}

	public static int GasStation(int gas[], int cost[]) {
		int start = 0;
		int result = 0;
		int curr = 0;
		for (int i = 0; i < gas.length; i++) {
			result += gas[i] - cost[i];
			curr += gas[i] - cost[i];
			if (curr < 0) {
				start = i + 1;
				curr = 0;
			}
		}
		if (result < 0) {
			return -1;
		} else {
			return start;
		}
	}
}
