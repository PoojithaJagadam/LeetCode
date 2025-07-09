class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int temp=0;
       int l=0;
       int n=nums.length;
       int ans=Integer.MAX_VALUE;
      
       for(int r=0;r<n;r++) {
            temp+=nums[r];
            
                while(temp>= target) {
                    ans=Math.min(ans, r-l+1);
                    temp-=nums[l];
                    l++;
               
            }
            
       }
       return ans == Integer.MAX_VALUE? 0:ans;
    }
}