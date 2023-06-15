class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(0, 0, "", n, result);
        return result;
    }

    public void helper(int start, int end, String str, int n, List<String> result) {
        if (str.length() == n * 2) {
            result.add(str);
            return;
        }

        if (start < n) {
            helper(start + 1, end, str + "(", n, result);
        }

        if (end < start) {
            helper(start, end + 1, str + ")", n, result);            
        }
    }
}