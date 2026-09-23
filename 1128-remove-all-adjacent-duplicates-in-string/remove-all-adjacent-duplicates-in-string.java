class Solution {
    static {
        for(int i = 0; i < 500; i++) removeDuplicates("a");
    }

    public static String removeDuplicates(String s) {
        char[] result = new char[s.length()];
        char[] ip = s.toCharArray();
        String resultString = "";
        int k=0;
        for(int i=0; i< ip.length; i++){
            if(k == 0){
                result[k] = ip[i];
                k++;
            }
            else{
                if(result[k-1] == ip[i]){
                    k--;
                }
                else{
                    result[k] = ip[i];
                    k++;
                }
            }
        }
        return new String(result, 0, k);
    }
}