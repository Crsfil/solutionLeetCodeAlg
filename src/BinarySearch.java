public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = InputUtils.readNumbers();
        int target = InputUtils.readTarget();
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(nums, target));
    }

    int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1; // ���������� �������
        while (left <= right) { // ��������
            int mid = left + (right - left) / 2; // ���������� �������
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) { // ���� ������� ������ ��������� 1 � ������
                                                // (� ���������� �� ������ �������� ����� ������� ��������)
                left = mid + 1;
            } else if (nums[mid] > target) { // ���� ������� ������ ������ 1 � ������
                                                // (�� ������ �������� ������� ����������)
                right = mid - 1;
            }
        }
        return -1;
    }
}
