class Solution {
    public boolean isValidSudoku(char[][] board) {
        int loopSize = board[0].length;
        Map<Integer, HashSet<Character>> squares = new HashMap<>();
        for(int i = 0; i < loopSize ; i++){
            Set<Character> dupR = new HashSet<>();
            Set<Character> dupC = new HashSet<>();
            for(int j = 0; j < loopSize ; j++){
                int sq = (i / 3) * 3 + (j / 3);
                if(!squares.containsKey(sq)){
                    squares.put(sq, new HashSet<>());
                }
                if(dupR.contains(board[i][j]) || dupC.contains(board[j][i]) || squares.get(sq).contains(board[i][j])){
                    return false;
                } else{
                    if(board[i][j] != '.'){
                        squares.get(sq).add(board[i][j]);
                        dupR.add(board[i][j]);    
                    }
                    if(board[j][i] != '.')
                        dupC.add(board[j][i]);
                }
            }
        }
        return true;
    }
}
