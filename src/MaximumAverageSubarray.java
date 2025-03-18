public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = InputUtils.readNumbers();
        int k = InputUtils.readTarget();
        System.out.println(findMaxAverage(nums, k));
    }

    static double findMaxAverage(int[] nums, int k) {
        int begin = 0;
        double windowState = 0;
        double result = -Double.MAX_VALUE;
        for (int end = 0; end < k; end++) {
            if (end - begin + 1 == k) {
                result = Math.max(result, windowState);
                windowState -= nums[begin];
                begin++;
            }
        }
        return result / k;
    }
}
