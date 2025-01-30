public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = InputUtils.readNumbers();
        int target = InputUtils.readTarget();
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(nums, target));
    }

    int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1; // определить границы
        while (left <= right) { // движение
            int mid = left + (right - left) / 2; // определить среднее
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) { // если среднее меньше прибавить 1 к старту
                                                // (в результате во второй итерации цикла среднее вырастет)
                left = mid + 1;
            } else if (nums[mid] > target) { // если среднее больше отнять 1 у финиша
                                                // (во второй итерации среднее уменьшится)
                right = mid - 1;
            }
        }
        return -1;
    }
}
