class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0, rows = matrix.length, cols = matrix[0].length;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (matrix[mid / cols][mid % cols] == target) {
                return true;
            }

            if (matrix[mid / cols][mid % cols] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}