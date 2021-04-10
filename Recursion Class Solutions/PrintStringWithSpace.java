package Medium;

public class PrintStringWithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		print_String(str.substring(1), "" + str.charAt(0));
	}

	public static void print_String(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		print_String(ques.substring(1), ans + ques.charAt(0));
		print_String(ques.substring(1), ans + " " + ques.charAt(0));
	}

}
