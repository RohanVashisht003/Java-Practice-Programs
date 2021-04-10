package Hard;

import java.util.*;

public class TowerOfHanoi {

	static int count=0;
	public static void towersOfHanoi(int n, int b, int e, int a) {
		if (n == 0){
            
			return;
        }
		towersOfHanoi(n - 1, b,a,e);
    count++;
		System.out.println("Move " + n+"th disc from T" +b + " to T" + e);

		towersOfHanoi(n - 1, a,e,b);
	}

    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		towersOfHanoi(n, 1,2,3);
        System.out.println(count);
    }
}
