class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] prefixCommonArray = new int[n];
        int[] frequency = new int[n + 1];
        int commonCount = 0;
        for (int currIndex = 0; currIndex < n; currIndex++) {
            frequency[A[currIndex]] += 1;
            if (frequency[A[currIndex]] == 2) {
                commonCount++;
            }
            frequency[B[currIndex]] += 1;
            if (frequency[B[currIndex]] == 2) {
                commonCount++;
            }
            prefixCommonArray[currIndex] = commonCount;
        }
        return prefixCommonArray;
    }
}