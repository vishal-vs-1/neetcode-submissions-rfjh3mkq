class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] hSet = new Set[9];
        Set<Character>[] vSet = new Set[9];
        Set<Character>[] bSet = new Set[9];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == '.') continue;
                int bSetPos = (j/3) + (i/3 * 3);
                if(hSet[i] == null)  hSet[i] = new HashSet<>();
                if(vSet[j] == null)  vSet[j] = new HashSet<>();
                if(bSet[bSetPos] == null)  bSet[bSetPos] = new HashSet<>();
                if(!hSet[i].add(board[i][j]) || !vSet[j].add(board[i][j]) || 
                    !bSet[bSetPos].add(board[i][j]))    return false;
                
            }
        }
        return true;
    }
}
