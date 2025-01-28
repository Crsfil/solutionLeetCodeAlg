import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = InputUtils.readNumbers();
        int target = nums[nums.length - 1];
        SearchInRotatedSortedArray sirsa = new SearchInRotatedSortedArray();
        sirsa.search(nums, target);
    }

    public int search(int[] nums, int target) {
        int start = nums[0];
        int end = nums[nums.length - 1];

        if (nums.length % 2 == 0) {
            int pivot = nums[nums.length / 2];
            for (int i = start; i <= end; i++) {
                if (nums[i] < pivot) {
                    while (nums[i] < pivot) {
                        i++;
                        int [] part1 = Arrays.stream(nums).toArray();
                    }
                } else {
                    while (nums[i] > pivot) {
                        i++;
                        int [] part2 = Arrays.stream(nums).toArray();
                    }
                }
            }
        } else {
            int pivot = nums[(nums.length-1) / 2];
            for (int i = start; i <= end; i++) {
                if (nums[i] < pivot) {
                    while (nums[i] < pivot) {
                        i++;
                        int [] part3 = Arrays.stream(nums).toArray();
                    }
                }else {
                    while (nums[i] > pivot) {
                        i++;
                        int [] part4 = Arrays.stream(nums).toArray();
                    }
                }
            }
        }
    }
}
