package Practice_Recursion;

public class ScaleTiklengthProblem {

	public static void pattern(int tl) {
		if(tl==0) {
			return;
		}
		// smaller problem
		pattern(tl - 1);

		// working
		for (int i = 1; i <= tl; i++) {
			System.out.print("-");
		}
		System.out.println();

		// smaller problem
		pattern(tl - 1);
	}

	public static void ruler(int inch, int mtl) {
		for(int i=1; i<=mtl; i++) {
			System.out.print("-");
		}
		System.out.println("0");
		for(int i=1; i<=inch; i++) {
			pattern(mtl-1);
			for(int j=1; j<=mtl; j++) {
				System.out.print("-");
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ruler(3,4);
	}

}
