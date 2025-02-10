public class MaxArea {
    public static void main(String[] args) {
        int[] heights = InputUtils.readNumbers();
        MaxArea maxArea = new MaxArea();
        System.out.println(maxArea.maxArea(heights));
    }

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
