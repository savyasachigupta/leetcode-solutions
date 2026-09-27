class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()){
            if (ch == '(') {
                st.push(result.length());
            }
            else if (ch == ')') {
                int start = st.pop();
                reverse(result, start, result.length() - 1);
            }
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    private void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }
}