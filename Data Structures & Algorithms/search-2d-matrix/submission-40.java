class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0; 
        int bottom = matrix.length - 1; 

        while (top <= bottom) {
            int midRow = top + (bottom - top) / 2;
            int firstItem = matrix[midRow][0];
            int lastItem = matrix[midRow][matrix[midRow].length - 1];
            if (firstItem <= target && lastItem >= target) {
                //do binary search inside row
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
                //no match found within row
                return false;
            } else if (lastItem < target) {
                top = midRow + 1;
            } else {
                bottom = midRow - 1;
            }

        }
        //not match found in matrix
        return false;
    }
}
