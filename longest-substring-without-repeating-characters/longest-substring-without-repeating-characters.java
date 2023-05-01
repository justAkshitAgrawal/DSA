class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int[] cache = new int[256];

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (cache[s.charAt(i)] > 0) {
                j = Math.max(j, cache[s.charAt(i)]);
            }

            cache[s.charAt(i)] = i + 1;
            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}