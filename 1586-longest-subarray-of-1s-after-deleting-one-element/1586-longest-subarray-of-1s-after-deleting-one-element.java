class Solution {
    public int longestSubarray(int[] nums) {
       int l=0,ans=0;
       int n=nums.length;
       int temp=0;
       for(int r=0;r<n;r++) {
        if(nums[r]==0) {
            temp++;
        }
        while(temp>1) {
            if(nums[l]==0) {
                temp--;
            }
            l++;
        }
        ans=Math.max(ans,r-l);
       }
       return ans;
    }
}