class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n=dimensions.length;
        int maxi=0,maxidq=0;
        for(int i=0;i<n;i++) {
            int x=dimensions[i][0];
            int y=dimensions[i][1];
            int square=(x*x+y*y);
            int ans=x*y;
            if(square>maxidq) {
                maxidq=square;
                maxi=ans;
            }
            else if(square==maxidq)
                maxi=Math.max(maxi,ans);
        }
        return maxi;
    }
}