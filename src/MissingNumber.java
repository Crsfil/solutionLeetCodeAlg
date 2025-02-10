
public class MissingNumber {
    public static void main(String[] args) {
        int[] ints = InputUtils.readNumbers();
        MissingNumber m = new MissingNumber();
        System.out.println(m.missingNumber(ints));
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int arifmProg = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return arifmProg - sum;
    }
}


// формула суммы арифметической прогрессии S = n*(n+1) / 2;