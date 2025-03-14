class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l=1,r=10000000;
        int res=0;
        while(l<=r) {
            int mid=l+(r-l)/2;
            long count=0;
            for(int i: candies) {
                count+=i/mid;
            }
            if(count>=k) {
                res=mid;
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return res;
    }
}