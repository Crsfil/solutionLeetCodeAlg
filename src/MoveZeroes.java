import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] nums = InputUtils.readNumbers();
        moveZeroes(nums);
    }

    static void moveZeroes(int[] nums) {
        int left = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0){
                nums[left] = nums[i];
                left++;
            }
        }
        while(left < nums.length) {
            nums[left] = 0;
            left++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
