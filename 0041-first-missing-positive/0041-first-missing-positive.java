class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++) {
            if(nums[i]<=0)
                nums[i]= Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++) {
            int x=nums[i];
            if(x<0)
                x=Math.abs(x);
            if(x<=n && nums[x-1]>0)
                nums[x-1]*= -1;
        }
        int ans=n+1;
        for(int i=0;i<n;i++) {
            if(nums[i]>0) {
                ans= i+1;
                break;
            }

        }
        return ans;
    }
}