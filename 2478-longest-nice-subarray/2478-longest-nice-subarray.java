class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l=0;
        int ans=0;
        int n=nums.length;
        int use=0;
       for(int r=0;r<n;r++){
            while((use & nums[r])!=0) {
                use^=nums[l];
                l++;
            }
            use |=nums[r];
            ans=Math.max(ans,r-l+1);
       }
        return ans;
    }
}