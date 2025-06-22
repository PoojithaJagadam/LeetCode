class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int maxi = -1;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(nums[i]<nums[j])
                maxi=Math.max(Math.abs(nums[i]-nums[j]),maxi);
            }
        }
       
        return maxi;
    }
}