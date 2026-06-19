class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if ('.' == board[i][j]) continue;
                String row = board[i][j] + " in row " + i;
                String column = board[i][j] + " in column " + j;
                String box = board[i][j] + " in box " + (i/3) + " - " + (j/3);
                if (!seen.add(row) || !seen.add(column) || !seen.add(box)) { //row constraint 
                    return false;
                }
            }
        }
        return true;
    }
}
