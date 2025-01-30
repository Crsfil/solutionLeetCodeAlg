
public class MissingNumber {
    public static void main(String[] args) {
        int[] ints = InputUtils.readNumbers();
        MissingNumber m = new MissingNumber();
        System.out.println(m.missingNumber(ints));
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int S = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return S - sum;
    }
}


// ������� ����� �������������� ���������� S = n*(n+1) / 2;