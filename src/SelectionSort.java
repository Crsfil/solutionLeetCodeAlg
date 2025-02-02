import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums = InputUtils.readNumbers();
        selectionSort(nums);
    }

    public static void selectionSort(int [] nums) {
        int out, in, min;
        for(out = 0; out < nums.length - 1; out++) {
            min = out;
            for (in = out + 1; in < nums.length; in++) {
                if(nums[in] < nums[min]) {
                    min = in;
                }
            }
            swap(nums, min, out);
        }
        System.out.println(Arrays.toString(nums));
    }

    static void swap(int[] nums, int one, int two) {
        BubbleSort.swap(nums, one, two);
    }

}
