class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (sumOfDigit(nums[i]) == i) {
                return i;
            }
        }
        return -1;
    }
    int sumOfDigit(int element) {
        if (element < 10) {
            return element;
        }
        int sum = 0;
        while(element > 0) {
            sum += element % 10;
            element = element / 10;
        }
        return sum;
    }
}