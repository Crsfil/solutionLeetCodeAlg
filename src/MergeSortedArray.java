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
        int [] container;
        int i = 0;
        container = new int[m + n];
        int cursor1 = 0, cursor2 = 0;

        while (cursor1 < m && cursor2 < n) {
            if(nums1[cursor1] <= nums2[cursor2]){
                container[i++] = nums1[cursor1++];
            }else {
                container[i++] = nums2[cursor2++];
            }
        }
        while (cursor1 < m) {
            container[i++] = nums1[cursor1++];
        }

        while (cursor2 < n) {
            container[i++] = nums2[cursor2++];
        }

    }
}
