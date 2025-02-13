public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = InputUtils.readNumbers();
        int k = InputUtils.readTarget();
        System.out.println(findMaxAverage(nums, k));
    }

    static double findMaxAverage(int[] nums, int k) {
        int end = k;
        double temp = 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            temp += nums[i];
        }
        sum = temp;

        while (end < nums.length) {
            temp += nums[end]-nums[end-k];
            end++;
            sum = Math.max(sum, temp);
        }
        return sum / k;
    }
}
