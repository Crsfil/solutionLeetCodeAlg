public class Solution {
    public static void main(String[] args) {
        int[]nums = {8860,-853,6534,4477,-4589,8646,-6155,-5577,-1656,-5779,-2619,-8604,-1358,-8009,4983,7063,3104,-1560,4080,2763,5616,-2375,2848,1394,-7173,-5225,-8244,-809,8025,-4072,-4391,-9579,1407,6700,2421,-6685,5481,-1732,-8892,-6645,3077,3287,-4149,8701,-4393,-9070,-1777,2237,-3253,-506,-4931,-7366,-8132,5406,-6300,-275,-1908,67,3569,1433,-7262,-437,8303,4498,-379,3054,-6285,4203,6908,4433,3077,2288,9733,-8067,3007,9725,9669,1362,-2561,-4225,5442,-9006,-429,160,-9234,-4444,3586,-5711,-9506,-79,-4418,-4348,-5891};
        int k = 93;
        System.out.println(findMaxAverage(nums, k));
        System.out.println(nums.length);
    }
    static double findMaxAverage(int[] nums, int k){
        int begin = 0;
        int windowState = 0;
        double result = -Double.MAX_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        for (int end = 0; end < nums.length; end++) {
            windowState += nums[end];
            if(end - begin + 1 == k) {
                result = Math.max(result, windowState);
                windowState -= nums[begin];
                begin += 1;
            }
        }
        return result / k;
    }
}
