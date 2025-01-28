import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int target = InputUtils.readTarget();
        int[] nums = InputUtils.readNumbers();
        SearchInRotatedSortedArray sirsa = new SearchInRotatedSortedArray();
        System.out.println(sirsa.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Левая половина отсортирована
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Правая половина отсортирована
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
