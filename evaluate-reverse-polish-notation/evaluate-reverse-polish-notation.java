class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(calc(num1, num2, s.charAt(0)));
            } else stack.push(Integer.parseInt(s));
        }

        return stack.pop();
    }

    public int calc(int a, int b, char op) {
        if (op == '+') return a + b;
        else if (op == '-') return a - b;
        else if (op == '*') return a * b;
        else return  a / b;
    }
}