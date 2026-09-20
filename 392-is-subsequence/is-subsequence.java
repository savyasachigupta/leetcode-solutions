class Solution {
    public boolean isSubsequence(String s, String t) {
        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();
        int count = 0;
        int tIndex = 0;
        for (char c : sArr){
            for (int i=tIndex; i<tArr.length; i++){
                if (c == tArr[i]){
                    count++;
                    tIndex = i+1;
                    break;
                }
            }
        }
        if (count != s.length()){
            return false;
        }
        return true;
    }
}