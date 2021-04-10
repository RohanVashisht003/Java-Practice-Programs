package Easy;
import java.util.*;
public class RemoveAChar {

	public static void removal(String str,char ch) {
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			if(ch == str.charAt(i)) {
				continue;
			}
			ans+=str.charAt(i);
		}
		
		System.out.println(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char ch = scn.next().charAt(0);
		removal(str,ch);
	}

}
