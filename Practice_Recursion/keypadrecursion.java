package Practice_Recursion;

public class keypadrecursion {

	public static String getcodes(char ch) {
		if (ch == '1') {
			return "abc";
		} else if (ch == '2') {
			return "def";
		} else if (ch == '3') {
			return "ghi";
		} else if (ch == '4') {
			return "jk";
		} else if (ch == '5') {
			return "lmno";
		} else if (ch == '6') {
			return "pqr";
		} else if (ch == '7') {
			return "stu";
		} else if (ch == '8') {
			return "vwx";
		} else if (ch == '9') {
			return "yz";
		} else if (ch == '0') {
			return "#@";
		} else {
			return "";
		}
	}

	public static void kpc(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		String code = getcodes(ch);

		for (int i = 0; i < code.length(); i++) {
			kpc(ros, ans + code.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kpc("145", "");
	}

}
