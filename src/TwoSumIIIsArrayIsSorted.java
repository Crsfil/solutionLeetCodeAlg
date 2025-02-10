import java.util.Arrays;
import java.util.HashMap;

public class TwoSumIIIsArrayIsSorted {
    public static void main(String[] args) {
        int[] num = InputUtils.readNumbers();
        int target = InputUtils.readTarget();
        TwoSumIIIsArrayIsSorted sol = new TwoSumIIIsArrayIsSorted();
        System.out.println(Arrays.toString(sol.twoSum(num, target)));
    }

    public int[] twoSum(int[] numbers, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int value;
//        for (int i = 0; i < numbers.length; i++) {
//            value = target - numbers[i];
//            if (map.containsKey(value)) {
//                return new int[]{map.get(value), i};
//            }
//            map.put(numbers[i], i);
//        }
//        return numbers;
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if(numbers[left] + numbers[right] == target) {
                return new int[] {left, right};
            } else if(numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return numbers;
    }
}
