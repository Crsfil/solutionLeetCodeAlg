import java.util.Arrays;
import java.util.HashMap;

public class SumTwo {
    public static void main(String[] args) {
        int[] num = InputUtils.readNumbers();
        int target = InputUtils.readTarget();
        SumTwo sumTwo = new SumTwo();
        System.out.println(Arrays.toString(sumTwo.twoSum(num, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key = 0; key < nums.length; key++) {
            int value = target - nums[key];

            if (map.containsKey(value)) {
                return new int[]{map.get(value), key};
            }
            map.put(nums[key], key);
        }

        return nums;
    }
}