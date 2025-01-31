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

//    static void bs(int[] ints){
////        �������
//        int left, right;
//// ������� ���� ���������� ������� ��������
//        for(right = ints.length - 1; right > 0; right--){
//// ���������� ����
//            for(left = 0; left < right; left++){
//// �������� ������ ���������� ��������� - ���������� �������� �������� ���� � ������, ���� 1 > 2 - swap
//                if(ints[left] > ints[left+1]){
//                    swap(ints, left, left + 1);
//                }
//            }
//        }
//        System.out.println(Arrays.toString(ints));
//    }

    public static void swap(int[] nums, int one, int two) {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }
}
