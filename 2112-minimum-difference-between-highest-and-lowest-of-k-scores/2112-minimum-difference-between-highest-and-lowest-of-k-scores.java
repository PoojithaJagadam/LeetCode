class Solution {
    public int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums);
       int n=nums.length;
       if(n==1)
        return 0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++) {
            int maxi=nums[i+k-1];
            int min=nums[i];
            mini=Math.min(mini, maxi-min);
            
        }
        return mini;
    }
}