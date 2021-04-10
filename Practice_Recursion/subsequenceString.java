package Practice_Recursion;

public class subsequenceString {

	public static void subsequences(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		subsequences(ros, ans);
		subsequences(ros, ans + ch);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		subsequences(str, "");
	}

}
