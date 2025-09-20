class Solution {

    public boolean dfs(char[][] board, int i, int j, String word, int idx) {
        int len = word.length();
        int m = board.length;
        int n = board[0].length;
        if(idx == len)
            return true;
        if(i<0 || i>=m || j<0 || j>=n || board[i][j] != word.charAt(idx))
            return false;
        board[i][j] ^= 256;
        boolean flag = dfs(board, i+1, j, word, idx+1) ||
                        dfs(board, i-1, j, word, idx+1) ||
                        dfs(board, i, j+1, word, idx+1) ||
                        dfs(board, i, j-1, word, idx+1);
        board[i][j] ^= 256;
        return flag;

    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(dfs(board, i, j, word, 0))
                    return true;
            }
        }
        return false;
    }
}