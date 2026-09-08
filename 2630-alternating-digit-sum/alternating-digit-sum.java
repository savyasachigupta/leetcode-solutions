class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String s = "" + n;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0){
                sum += s.charAt(i) - '0';
            }
            else {
                sum -= s.charAt(i) - '0';
            }
        }
        return sum;
    }
}