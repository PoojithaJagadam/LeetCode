class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=1;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(j-1<0) 
                    continue;
                else if(matrix[i][j] != matrix[i-1][j-1])
                    return false;
            }
        }
        return true;
    }
}