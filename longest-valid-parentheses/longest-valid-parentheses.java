class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();

        if (s == null || s.length() < 2) return 0;

        int max = 0;
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                stack.pop();
                if (stack.isEmpty()) stack.push(i);
                else max = Math.max(max, i - stack.peek());
            }
        }

        return max;
    }
}