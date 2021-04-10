package Easy;

import java.util.Scanner;

public class NobitaScoredGoodMarks {
	 public static void Nobita(int candy, int student) {
	        if(candy%student==0){
	            System.out.println("0");
	        }
	        else{
	            int ans  = candy/student;
	            System.out.println(Math.min(candy%student,(ans+1)*(student)-candy));
	        }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t != 0) {
			int candy = scn.nextInt();
			int student = scn.nextInt();
			Nobita(candy, student);
			t--;
		}
	}

}
