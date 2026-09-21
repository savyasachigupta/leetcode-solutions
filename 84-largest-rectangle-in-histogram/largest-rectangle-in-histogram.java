class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int top=-1;
        int[] arr= new int[n];
        int left, currHeight, right, maxArea = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n) {
                currHeight = 0;
            }
            else {
                currHeight = heights[i];
            }
            while (!(top == -1) && (heights[arr[top]] > currHeight)) {
                right = i;
                int h = heights[arr[top--]];
                if (top == -1) {
                    left = -1;
                }
                else {
                    left = arr[top];
                }
                int width = right - left - 1;
                int area = h * width;
                maxArea = Math.max(area, maxArea);
            }
            if (i < n) {
            arr[++top] = i;
            }
        }
        return maxArea;
    }
}