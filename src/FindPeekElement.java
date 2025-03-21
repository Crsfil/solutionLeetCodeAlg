

public class FindPeekElement {
    public static void main(String[] args) {
        int[] arr = InputUtils.readNumbers();
        System.out.println(findPeakElement(arr));
    }

    static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
