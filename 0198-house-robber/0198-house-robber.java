class Solution {

    static int helper(int[] nums, int idx, int[] dp) {
        int n=nums.length;
        if(idx >= n) 
            return 0;
        if(dp[idx] != -1) 
            return dp[idx];
        int ans1 = helper(nums, idx + 1, dp);
        int ans2 = nums[idx] + helper(nums, idx+2, dp);
        dp[idx] = Math.max(ans1, ans2);
        return dp[idx];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return helper(nums, 0, dp);
    }
}