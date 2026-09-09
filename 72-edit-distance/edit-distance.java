class Solution {
    static Integer dp[][];
    static int solve (String s1, String s2, int idx1, int idx2) {
        if (idx1 < 0) {
            return idx2 + 1;
        }
        if (idx2 < 0) {
            return idx1 + 1;
        }
        if (dp[idx1][idx2] != null) {
            return dp[idx1][idx2];
        }
        if (s1.charAt(idx1) == s2.charAt(idx2)) {
            dp[idx1][idx2] = solve(s1, s2, idx1 - 1, idx2 - 1);
        }
        else {
            dp[idx1][idx2] = 1 + Math.min(solve(s1, s2, idx1, idx2 - 1) , Math.min(solve(s1, s2, idx1 - 1, idx2), solve(s1, s2, idx1 - 1, idx2 - 1)));
        }
        return dp[idx1][idx2];
    }

    public int minDistance(String word1, String word2) {
        dp = new Integer[word1.length()][word2.length()];
        int res = solve(word1, word2, word1.length() - 1, word2.length() - 1);
        return res;
    }
}