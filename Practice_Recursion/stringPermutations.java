package Practice_Recursion;

public class stringPermutations {

	public static void Permutations(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(0);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			Permutations(ros, ans + ch);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Permutations("abc", "");
	}

}
