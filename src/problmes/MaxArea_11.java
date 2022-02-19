package problmes;

public class MaxArea_11 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int startIndex = 0;
        int endIndex = height.length - 1;
        while (startIndex < endIndex) {
            maxArea = Math.max(maxArea, Math.min(height[startIndex], height[endIndex]) * (endIndex - startIndex));
            if (height[startIndex] < height[endIndex]) {
                startIndex++;
            } else {
                endIndex--;
            }
        }
        return maxArea;
    }

}
