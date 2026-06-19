class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0; 
        int bottom = matrix.length - 1; 

        while (top <= bottom) {
            int midRow = top + (bottom - top) / 2; 
            int firstItemInRow = matrix[midRow][0];
            int lastItemInRow = matrix[midRow][matrix[midRow].length -1];

            if (firstItemInRow <= target && lastItemInRow >= target) {
                //do binary search inside the row
                int left = 0; 
                int right = matrix[midRow].length - 1; 

                while (left <= right) {
                    int mid = left + (right - left) / 2; 
                    if (matrix[midRow][mid] == target) {
                        return true; //match found
                    } else if (matrix[midRow][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1; 
                    }
                }
                //no match inside row
                return false;
            } else if (lastItemInRow < target) { 
                top = midRow + 1;
            } else {
                bottom = midRow - 1;
            }
        }

        return false;
    }
}
