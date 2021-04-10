package Medium;
import java.util.*;
public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        while(tc>0) {
            String str = sc.nextLine();
            reverseWords(str);
            tc--;
        }
    }
    public static void reverseWords(String str) {
        String rev = "";
        int i = str.length()-1;
        while (i >= 0) {
            while (i >= 0 && str.charAt(i)==' ') i--;
            int j = i;
            if (i < 0) break;
            while (i >= 0 && str.charAt(i)!=' ') i--;
            if (rev.isEmpty())
                rev = rev.concat(str.substring(i + 1, j + 1));
            else
                rev = rev.concat(" " + str.substring(i + 1, j + 1));
        }
        System.out.println(rev);
    }
}