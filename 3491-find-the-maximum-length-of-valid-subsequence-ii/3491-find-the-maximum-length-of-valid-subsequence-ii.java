class Solution {
    public int maximumLength(int[] nums, int k) {
        int n=nums.length;
        // we used 2d array because to find all combinations of subsequences its leads to k*k combinations 
        // starting dp is filled with 0's
        int[][] dp=new int[k][k];
        int ans=0;
        for(int num:nums) {
            num%=k;
            for(int i=0;i<k;i++) {
                // if it present before thenincrement its length
                dp[i][num] = dp[num][i] +1;
                // update the ans to max value
                ans= Math.max(ans, dp[i][num]);
            }
        }
        return ans;
    }
}