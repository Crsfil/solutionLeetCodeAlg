import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int [] nums = InputUtils.readNumbers();
        ThreeSum thrs = new ThreeSum();
        System.out.println(thrs.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int current = nums[left] + nums[right];
                if (current == target) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (current > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return set.stream().toList();
    }
}
