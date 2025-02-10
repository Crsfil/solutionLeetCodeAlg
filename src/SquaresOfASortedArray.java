import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int [] nums = InputUtils.readNumbers();
        SquaresOfASortedArray obj = new SquaresOfASortedArray();

        System.out.println(Arrays.toString(obj.sortedSquares(nums)));
    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[]result = new int[n];
        int left = 0, right = n - 1;

        for (int i = right; i >= 0; i--) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[i] = nums[right] * nums[right];
                right--;
            } else {
                result[i] = nums[left] * nums[left];
                left++;
            }
        }
        return result;
    }
}
