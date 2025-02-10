import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] orig = t.toCharArray();
        char[] sub = s.toCharArray();
        int j = 0;

        for (char c : orig) {
            if (j < sub.length && sub[j] == c) {
                j++;
            }
        }

        return j == sub.length;
    }
}
