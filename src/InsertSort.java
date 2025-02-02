import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, 1, 3, 4, 5};
        insertSort(arr);
    }

    static void insertSort(int[] arr) {
        int out = arr.length - 1;
        int in = 0;
        int temp = 0;
        while (in < out) {
            in++;
            int mid = (in + out) / 2;
            if (arr[in] > arr[mid]) {
                swap(arr, in, mid);
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[]nums, int one, int two) {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }

}
