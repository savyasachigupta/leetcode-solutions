class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for (int i = 0; i < num; i++) {
            if (i + reverse(i) == num) {
                return true;
            }
        }
        return false;
    }
    int reverse(int a) {
        int rev = 0;
        while (a > 0) {
            rev = (rev * 10) + (a % 10);
            a /= 10;
        }
        return rev;
    }
}