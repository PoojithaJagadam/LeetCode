class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> arr=new ArrayList<>();
        int top=0,left=0,right=m-1,btm=n-1;

        while( left<=right && top<=btm ) {
            for(int i=top;i<=right;i++) {
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=btm;i++) {
                arr.add(matrix[i][right]);
            }
            right--;
            if(top<=btm) {
                for(int i=right;i>=left;i--) {
                    arr.add(matrix[btm][i]);
                }
                btm--;
            } 
            if(left<=right) {
                for(int i=btm;i>=top;i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }

        }
         return arr;   
    }
}