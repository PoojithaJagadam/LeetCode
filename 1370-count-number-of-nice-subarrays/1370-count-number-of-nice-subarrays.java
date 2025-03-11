class Solution {
    
       static int atmost(int[] nums,int k) {
        int n=nums.length;
        int temp=0;
        int l=0,ans=0;
        for(int r=0;r<n;r++) {
            if(nums[r]%2==1) {
                temp++;
            }
            while(temp>k) {
                if(nums[l]%2==1) {
                    temp--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
       }
    public int numberOfSubarrays(int[] nums, int k) {        
        return atmost(nums,k)-atmost(nums,k-1);
    }
}