public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[]nums = InputUtils.readNumbers();
        int target = InputUtils.readTarget();
        MaxConsecutiveOnesIII maxConsecutiveOnes = new MaxConsecutiveOnesIII();
        System.out.println(maxConsecutiveOnes.longestOnes(nums, target));
    }

    public int longestOnes(int[] nums, int k) {
        int begin = 0;
        int windowState = 0;
        int result = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                windowState++;
            }
            while (windowState > k) {
                if (nums[begin] == 0) {
                    windowState--;
                }
                begin++; // Всегда двигаем начало окна
            }
            result = Math.max(result, end - begin + 1);
        }
        return result;
    }
}
