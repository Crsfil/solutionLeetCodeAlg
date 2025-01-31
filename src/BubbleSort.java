import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = InputUtils.readNumbers();
        bubbleSort(array);
    }

    public static void bubbleSort(int[] nums) {
        int out, in;
        for (out = nums.length - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (nums[in] > nums[in + 1]) {  // ��������� ������� ��� ������
                    swap(nums, in, in + 1);
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }

//        int out, in;
//        for(out=nElems-1; out>1; out--) // ������� ���� (��������)
//            for(in=0; in<out; in++) // ���������� ���� (������)
//                if( a[in] > a[in+1] ) // ������� �������?
//                    swap(in, in+1); // �������� �������
//    }

    public static void swap(int[] nums, int one, int two) {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }
}
