import java.util.Arrays;

public class BackspaceCompare {
    public static void main(String[] args) {
        String s = InputUtils.readTargetString();
        String t = InputUtils.readTargetString();
        backspaceCompare(s, t);
    }

    public static boolean backspaceCompare(String s, String t) {
        int countBackspaceF = 0;
        int countBackspaceS = 0;
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();
        for(int i = firstString.length - 1; i > 0; i--) {
            if (firstString[i] == '#'){
                countBackspaceF+=2;
                firstString[i] = firstString[i-countBackspaceF];

            }
        }
        System.out.println(Arrays.toString(firstString));
        for(char c : secondString){
            if (c == '#'){
                countBackspaceS+=2;
            }
        }
        return false;
    }
}
