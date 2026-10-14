class Solution {
    public int smallestEvenMultiple(int n) {
        int i = 2, ans;
        while (true) {
            if (i % 2 == 0 && i % n == 0) {
                ans = i;
                break;
            }
            i++;
        }
        return ans;
    }
}