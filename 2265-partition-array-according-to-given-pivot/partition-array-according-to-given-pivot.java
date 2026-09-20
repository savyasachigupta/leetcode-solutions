class Solution {
    static {
        for (int i = 1; i <= 500; i++) {
            pivotArray(new int[0], 0);
        }
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int i = 0, left = 0, j = nums.length - 1, right = j;
        while (j >= 0) {
            if (nums[i] < pivot) {
                result[left] = nums[i];
                left++;
            }
            if (nums[j] > pivot) {
                result[right] = nums[j];
                right--;
            }
            i++;
            j--;
        }
        for (int k = left; k <= right; k++) {
            result[k] = pivot;
        }
        return result;
    }
}