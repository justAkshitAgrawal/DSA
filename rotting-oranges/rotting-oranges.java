class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) helper(i, j, grid, 2);
            }
        }

        int min = 2;

        for (int[] row : grid) {
            for (int i : row) {
                if (i == 1) return -1;
                min = Math.max(min, i);
            }
        }

        return min - 2;
    }


    void helper(int i, int j, int[][] grid, int min) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || ( 1 < grid[i][j] && grid[i][j]< min)) return;
        
        grid[i][j] = min;

        helper(i - 1, j, grid, min + 1);
        helper(i + 1, j, grid, min + 1);
        helper(i, j - 1, grid, min + 1);
        helper(i, j + 1, grid, min + 1);
    }
}