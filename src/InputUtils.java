import java.util.Arrays;
import java.util.Scanner;

public final class InputUtils {
    private static final Scanner IN = new Scanner(System.in);

    private InputUtils() {}

    public static int readTarget() {
        return IN.nextInt();
    }

    public static int[] readNumbers() {
        return Arrays.stream(IN.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}