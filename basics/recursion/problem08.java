import java.util.Scanner;
import java.util.*;
public class problem08 {
    public static void main(String[] args) {
        String s;
        System.out.print("please enter the word ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        problem08 obj = new problem08();
       System.out.print( obj.print(0, s));
    }
    public boolean print(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return print(i + 1, s);
    }
}
