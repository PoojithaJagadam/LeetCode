class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int temp=0;
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++) {
            if(nums[i]==0) 
                temp++;
            while(temp>k) {
                if(nums[l]==0) {
                    temp--;
                }
                l++;
            }
            ans=Math.max(ans, i-l+1);
        }
        return ans;
    }
}