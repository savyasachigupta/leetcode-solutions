class Solution {
    public String addSpaces(String s, int[] spaces) {
        int m = s.length(), n = spaces.length;
        char[] orig = s.toCharArray();
        char[] res = new char[m + n];
        int idx = 0, spc = 0;
        for (int space : spaces) {
            while (idx < space) {
                res[idx + spc] = orig[idx];
                idx ++;
            }
            res[idx + spc] = ' ';
            spc ++;
        }
        while (idx < m) {
            res[idx + spc] = orig[idx];
            idx ++;
        }
        return new String(res);
    }
}