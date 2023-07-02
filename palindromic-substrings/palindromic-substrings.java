class Solution {

    int count = 1;

    public int countSubstrings(String s) {
        if (s.length() == 0) return 0;

        for (int i = 0; i < s.length() - 1; i++) {
            helper(s, i, i);
            helper(s, i, i+1);
        }

        return count;
    }

    public void helper(String str, int l, int r) {
        while (
            l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)
        ) {
            count++;
            l--;
            r++;
        }
    }
}