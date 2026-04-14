class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] colSet = new int[9][9];
        int[][] blockSet = new int[9][9];
        for(int i = 0 ; i < board.length; i++){
            int[] rowSet = new int[9];
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == '.')  continue;
                int element = board[i][j] - '1';
                int block = (j/3) + ((i/3)*3);
                rowSet[element]++;
                colSet[j][element]++;
                blockSet[block][element]++;
                if(rowSet[element] > 1 || colSet[j][element] > 1 
                    || blockSet[block][element]>1){
                    return false;
                }
            }
        }
        return true;
    }
}
