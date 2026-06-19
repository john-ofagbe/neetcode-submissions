class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int topRow = 0;
        int bottomRow = matrix.length - 1;

        while(topRow <= bottomRow) {
            int midRow = topRow + (bottomRow - topRow) / 2;
            int firstItem = matrix[midRow][0];
            int lastItem = matrix[midRow][matrix[midRow].length - 1];
            if (firstItem <= target && lastItem >= target) {
                int left = 0; 
                int right = matrix[midRow].length - 1; 
                
                while(left <= right) {
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
                
            } else if (lastItem < target) {
                topRow = midRow + 1;
            } else {
                bottomRow = midRow - 1;
            }
        }

        return false;
    }
}
