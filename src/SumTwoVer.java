import java.util.Arrays;
import java.util.HashMap;

public class SumTwoVer {
    public static void main(String[] args) {
        int[] nums = InputUtils.readNumbers();
        int target = InputUtils.readTarget();
        System.out.println(Arrays.toString(sumTwo(nums, target)));
    }

    static int[] sumTwo(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int f = target - nums[i];

            if (map.containsKey(f)) {
                return new int[]{map.get(f), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
