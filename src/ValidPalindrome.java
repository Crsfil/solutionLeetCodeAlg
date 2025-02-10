import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[\\s\\p{Punct}]","").toLowerCase();
        System.out.println(s);
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
