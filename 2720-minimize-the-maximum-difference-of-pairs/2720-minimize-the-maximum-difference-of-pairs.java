class Solution {
    public boolean hasPair(int[] nums,int diff, int p) {
        int n=nums.length;
        int c=0;
        int i=0;
        while(i< n-1) {
            if(Math.abs(nums[i] - nums[i+1]) <= diff) {
                c++;
                i+=2;
            }
            else {
                i++;
            }
            if(c>=p) 
            return true;
        }
        return false;

    }
    public int minimizeMax(int[] nums, int p) {
        //int ans=0;
        int n=nums.length;
        if(p==0) 
            return 0;
        Arrays.sort(nums);
        int l=0;
        int r=nums[n-1] - nums[0];
        while(l<r) {
            int mid=l+(r-l)/2;
            if(hasPair(nums,mid,p)) {
                r=mid;
            }
            else {
                l=mid+1;
            }
        }
        return l;

    }
}