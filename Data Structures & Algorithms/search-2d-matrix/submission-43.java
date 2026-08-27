class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;

        while (top <= bottom) {
            int midRow = top + (bottom - top) / 2;
            if (matrix[midRow][0] <= target && matrix[midRow][matrix[midRow].length - 1] >= target) {
                // do binary search, target is within range
                int left = 0; 
                int right = matrix[midRow].length - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (matrix[midRow][mid] == target) {
                        return true;
                    } else if (matrix[midRow][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                return false;
                
            }
            else if (matrix[midRow][matrix[midRow].length - 1] < target) {
                top = midRow + 1;
            }
            else {
                bottom = midRow - 1;
            }
        }
        return false;
    }
}
