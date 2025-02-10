import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = InputUtils.readNumbers();
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[k] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k + 1;
    }
}
