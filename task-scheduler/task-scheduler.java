class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];

        for (char ch : tasks) freq[ ch - 'A']++;

        Arrays.sort(freq);

        int max = freq[25], count = 0;

        for (int i : freq)
            if ( i == max) count++;
        
        return Math.max(tasks.length, (max - 1) * (n + 1) + count);
    }
}