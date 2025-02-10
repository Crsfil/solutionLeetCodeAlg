public class FindMin {
    public static void main(String[] args) {
        int [] arr = InputUtils.readNumbers();
        System.out.println(findMin(arr));
    }

    static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        if (nums[left] < nums[right]) {
            return nums[left];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == nums[right]) {
                right--;
            }
            else if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return nums[left];
    }
}
