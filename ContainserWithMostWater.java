public class ContainserWithMostWater {
    public static void main(String[] args) {
        int[] height={1,0,0,0,0,0,0,2,2};
        ContainserWithMostWater cw = new ContainserWithMostWater();
        int area = cw.maxArea(height);
        System.out.println(area);
    }
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
