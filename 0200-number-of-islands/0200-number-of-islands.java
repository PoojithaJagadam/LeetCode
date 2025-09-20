class Solution {

    static void dfs(int m, int n, char[][] a,int i, int j) {
        if(i<0 || i>=m || j<0 || j>=n || a[i][j] != '1')
            return;
        a[i][j] = '$';
        dfs(m, n, a, i+1, j); //down
        dfs(m, n, a, i-1, j); //up
        dfs(m, n, a, i, j+1); //right
        dfs(m, n, a, i, j-1); //left
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length, island = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] == '1') {
                    dfs(m, n, grid, i, j);
                    island++;
                }
            }
        }
        return island;
    }
}