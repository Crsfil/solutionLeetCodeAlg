import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = InputUtils.readNumbers();
        int target = InputUtils.readTarget();
        SearchInRotatedSortedArray sirsa = new SearchInRotatedSortedArray();
        System.out.println(sirsa.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) { // запускаем движение
            int mid = left + (right - left) / 2; // находим среднее

            if (nums[mid] == target) { // если число со средним индексом равно цели
                // - значит все готово - ретерн
                return mid;
            }

            // Левая половина отсортирована
            // ищем цель в левой половине
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Правая половина отсортирована
            // ищем цель в правой половине
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
