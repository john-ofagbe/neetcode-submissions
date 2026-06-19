class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowToSearch = getRowIndex(matrix, target);
        if (rowToSearch == -1) {
            return false;
        }
        int left = 0; 
        int right = matrix[rowToSearch].length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[rowToSearch][mid] == target) {
                return true;
            } else if (matrix[rowToSearch][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;

    }

    private int getRowIndex(int[][] matrix, int target) {
        int topRow = 0;
        int bottomRow = matrix.length - 1;

        while (topRow <= bottomRow) {
            int midRow = topRow + (bottomRow - topRow) / 2; 
            int lastItem = matrix[midRow][matrix[midRow].length - 1];
            if (matrix[midRow][0] <= target && lastItem >= target) {
                return midRow;
            } else if (lastItem < target) {
                topRow = midRow + 1;
            } else {
                bottomRow = midRow - 1;
            }
        }

        return -1;
    }
}
