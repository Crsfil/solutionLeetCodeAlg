import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = InputUtils.readNumbers();
        int[] nums2 = InputUtils.readNumbers();
        int m = InputUtils.readTarget();
        int n = InputUtils.readTarget();
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int cursor1 = m - 1;
        int cursor2 = n - 1;


        while (cursor1 >= 0 && cursor2 >= 0) {
            if (nums1[cursor1] > nums2[cursor2]) {
                nums1[i--] = nums1[cursor1--];
            } else {
                nums1[i--] = nums2[cursor2--];
            }
        }


        while (cursor2 >= 0) {
            nums1[i--] = nums2[cursor2--];
        }

        System.out.println(Arrays.toString(nums1));
    }
}
