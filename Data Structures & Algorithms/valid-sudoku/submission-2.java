class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> sqSearch = new HashMap<>();
        Map<Integer, Set<Character>> rowSearch = new HashMap<>();
        Map<Integer, Set<Character>> colSearch = new HashMap<>();
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board.length; column++){
                int sqNo = (row/3)*3 + (column/3);
                sqSearch.putIfAbsent(sqNo, new HashSet<>());
                rowSearch.putIfAbsent(row, new HashSet<>());
                colSearch.putIfAbsent(column, new HashSet<>());
                char c= board[row][column];
                if (c == '.') continue;
                if(sqSearch.get(sqNo).contains(c) || rowSearch.get(row).contains(c) || colSearch.get(column).contains(c))
                    return false;
                
                sqSearch.get(sqNo).add(c);
                rowSearch.get(row).add(c);
                colSearch.get(column).add(c);
                
            }
        }
        return true;        
    }
}
