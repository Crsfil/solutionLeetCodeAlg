public class SqrtX {
    public static void main(String[] args) {
        int x = InputUtils.readTarget();
        SqrtX sqrtX = new SqrtX();
        System.out.println(sqrtX.sqrtX(x));
    }

    int sqrtX(int x) {
        if (x == 0) return 0; // Обработка случая x = 0

        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}

