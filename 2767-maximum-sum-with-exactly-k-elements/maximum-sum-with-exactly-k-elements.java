class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        for(int val : nums) max = Math.max(max, val);
        int val = max+k-1;

        return ((val)*(val+1)/2) - ((max)*(max-1)/2);
    }
}