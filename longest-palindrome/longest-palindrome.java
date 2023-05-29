class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray())
            count[c]++;

        int oddCount = -1;

        for (int num : count) {
            if (num % 2 != 0) oddCount++;
        }

        return (oddCount > 0) ? s.length() - oddCount : s.length();
    }
}