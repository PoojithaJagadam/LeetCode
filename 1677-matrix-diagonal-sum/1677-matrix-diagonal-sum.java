class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        /*brute force
        for(int i=0;i<n;i++) {
            for(int j=0;j<mat[i].length;j++) {
                if(i == j || j == (n-i-1)) {
                    sum += mat[i][j];
                }
            }
        }*/

        for(int i=0;i<n;i++) {
            sum+= mat[i][i];
            sum+=mat[i][n-i-1];
        }
        if(n%2==0)
            return sum;
        else
            return sum - mat[n/2][n/2];
    }
}