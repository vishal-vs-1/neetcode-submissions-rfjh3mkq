class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] colSet = new Set[9];
        Set<Character>[] blockSet = new Set[9];
        for(int i = 0 ; i < board.length; i++){
            Set<Character> rowSet = new HashSet<>();
            for(int j = 0; j < board[i].length; j++){
                char element = board[i][j];
                if(element == '.')  continue;
                int block = (j/3) + ((i/3)*3);
                // System.out.println(block);
                if(colSet[j] == null){
                    colSet[j] = new HashSet<>();
                }
                if(blockSet[block] == null){
                    blockSet[block] = new HashSet<>();
                }
                if(!rowSet.add(element) || !colSet[j].add(element) 
                    || !blockSet[block].add(element)){
                    return false;
                }
            }
        }
        return true;
    }
}
