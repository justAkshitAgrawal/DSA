class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        
        alt[0] = 0;
        alt[1] = gain[0];

        int max = alt[0] > alt[1] ? alt[0] : alt[1];

        for (int i = 2; i < alt.length; i++) {
            alt[i] = alt[i - 1] + gain[i - 1];
            if (alt[i] > max) max = alt[i];
        }

        return max;
    }
}