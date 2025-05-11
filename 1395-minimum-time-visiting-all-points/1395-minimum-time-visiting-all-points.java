class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length;
        int ans=0;
        for(int i=0;i<n-1;i++) {
            int x1 = points[i][0];
            int y1= points[i][1];
            int x2= points[i+1][0];
            int y2= points[i+1][1];
            ans+= Math.max(Math.abs(x2-x1) , Math.abs(y2-y1));
        
        }
        return ans;
    }
}