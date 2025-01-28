import java.util.Arrays;
import java.util.Scanner;

public final class InputUtils {
    private static final Scanner IN = new Scanner(System.in);

    private InputUtils() {} // Запрет создания экземпляров

    public static int readTarget() {
        int target = IN.nextInt();
        IN.nextLine(); // Очистка буфера
        return target;
    }

    static int readUtilIntegerOne() {
        int number = IN.nextInt();
        IN.nextLine();
        return number;
    }

    static int readUtilIntegerTwo() {
        int number = IN.nextInt();
        IN.nextLine();
        return number;
    }

    public static int[] readNumbers() {
        return Arrays.stream(IN.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}