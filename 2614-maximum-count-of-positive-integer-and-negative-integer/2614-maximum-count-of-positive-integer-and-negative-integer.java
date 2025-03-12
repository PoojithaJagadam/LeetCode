class Solution {
    
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int l=0,h=n-1;
        int ceil=0,floor=0;
        while(l<=h) {
            int mid=l+(h-l)/2;
            if(nums[mid]<0) {
               // floor=mid;
                l=mid+1;
            }
           
            else  {
                h=mid-1;
            }
        }
        floor=h;

        int low=0,high=n-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(nums[mid]>0) {
                //ceil=mid;
                high=mid-1;
            }
           
            else {
                low=mid+1;
            }
        }
        ceil=low;
        int tot=n-ceil;
        return Math.max(n-ceil,floor+1);
    }
}