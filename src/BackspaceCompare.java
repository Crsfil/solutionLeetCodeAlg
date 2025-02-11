
public class BackspaceCompare {
    public static void main(String[] args) {
        String s = InputUtils.readTargetString();
        String t = InputUtils.readTargetString();
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        int cursor1 = s.length() - 1;
        int cursor2 = t.length() - 1;
        int skip1 = 0;
        int skip2 = 0;
        while (cursor1 >= 0 || cursor2 >= 0) {
            while (cursor1 >= 0) {
                if (s.charAt(cursor1) == '#') {
                    skip1++;
                    cursor1--;
                } else if (skip1 > 0) {
                    skip1--;
                    cursor1--;
                } else {
                    break;
                }
            }
            while (cursor2 >= 0) {
                if (t.charAt(cursor2) == '#') {
                    skip2++;
                    cursor2--;
                } else if (skip2 > 0) {
                    skip2--;
                    cursor2--;
                } else {
                    break;
                }
            }
            if (cursor1 >= 0 && cursor2 >= 0) {
                if (s.charAt(cursor1) != t.charAt(cursor2)) {
                    return false;
                }
            } else if (cursor1 >= 0 || cursor2 >= 0) {
                return false;
            }
            cursor1--;
            cursor2--;
        }
        return true;
    }
}
