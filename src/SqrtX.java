public class SqrtX {
    public static void main(String[] args) {
        int x = InputUtils.readTarget();
        SqrtX sqrtX = new SqrtX();
        System.out.println(sqrtX.sqrtX(x));
    }

    int sqrtX(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sqrt = (long) mid * mid;
            if (sqrt == x) {
                return mid;
            } else if (sqrt < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}

