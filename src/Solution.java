import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        MaxSumSubArr(arr, k); // 39
    }

    public static void MaxSumSubArr(int[] nums, int k) {
        int begin = 0, sum = 0, windowState = 0;
        for(int end = 0; end < nums.length; end++) {
            windowState += nums[end];
            if (end - begin + 1 > k) {
                windowState -= nums[begin];
                sum = Math.max(sum, windowState);
                begin++;
            }
        }
        System.out.println(sum);
    }
}