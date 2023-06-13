class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;

        int count = 0;

        Map<String, Integer> map = new HashMap<>();

        for( int[] row : grid) {
            String str = Arrays.toString(row);
            map.put(str, 1 + map.getOrDefault(str, 0));
        }

        for ( int i = 0; i < n; i++) {
            int[] colArr = new int[n];

            for (int j = 0; j < n; j++) {
                colArr[j] = grid[j][i];
            }

            count += map.getOrDefault(Arrays.toString(colArr), 0);
        }

        return count;
    }
}