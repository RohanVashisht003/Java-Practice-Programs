package Practice_Recursion;

public class subsequenceWithAscii {

	public static void subsequenceAscii(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		subsequenceAscii(ros, ans);
		subsequenceAscii(ros, ans + ch);
		subsequenceAscii(ros, ans + ((int) ch));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "ab";
subsequenceAscii(str, "");
	}

}
