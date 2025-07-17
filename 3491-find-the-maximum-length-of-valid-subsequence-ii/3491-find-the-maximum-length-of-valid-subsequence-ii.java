class Solution {
    public int maximumLength(int[] nums, int k) {
        int n=nums.length;
        int[][] dp=new int[k][k];
        int ans=0;
        for(int num:nums) {
            num%=k;
            for(int i=0;i<k;i++) {
                dp[i][num] = dp[num][i] +1;
                ans= Math.max(ans, dp[i][num]);
            }
        }
        return ans;
    }
}