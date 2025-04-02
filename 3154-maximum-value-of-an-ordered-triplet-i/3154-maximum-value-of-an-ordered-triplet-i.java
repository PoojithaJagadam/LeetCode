class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long max1=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    
                    long p=(long)(nums[i]-nums[j])*nums[k];
                    max1=Math.max(max1,p);
                }
            }
        }
        return max1;
    }
}