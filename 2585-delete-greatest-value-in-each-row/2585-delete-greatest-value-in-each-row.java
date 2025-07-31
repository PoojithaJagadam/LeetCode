class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int[] row: grid) {
            Arrays.sort(row);
        }
        int sum=0;
        for(int i=0;i<m;i++) {
            int maxi=0;
            for(int j=0;j<n;j++) {
                maxi = Math.max(maxi, grid[j][i]);
            }
            sum+=maxi;
        }
        return sum;
    }
}