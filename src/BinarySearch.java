public class BinarySearch {
    public static void main(String[] args) {
        int target = InputUtils.readTarget();
        int[] nums = InputUtils.readNumbers();
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(nums, target));
    }

    int binarySearch(int[] nums, int target) {
        int left = nums[0];
        int right = nums[nums.length-1];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
                return left;
            } else if (nums[mid] > target) {
                right = mid - 1;
                return right;
            }
        }
        return left;
    }
}
