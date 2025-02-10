public class FibonacciNumber {
    public static void main(String[] args) {
        int target = InputUtils.readTarget();
        System.out.println(fibonacci(target));
    }
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
