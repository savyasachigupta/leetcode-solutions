class Solution {
    public boolean halvesAreAlike(String s) {
        int ct = 0;
        int len = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < len / 2; i++) {
            char ch1 = arr[i];
            char ch2 = arr[i + len / 2];
            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {
                ct++;
            }
            if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' || ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') {
                ct--;
            }
        }
        return ct == 0;
    }
}