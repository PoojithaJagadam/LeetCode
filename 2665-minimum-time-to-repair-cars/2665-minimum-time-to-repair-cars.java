class Solution {
    public long repairCars(int[] ranks, int cars) {
        int min=Integer.MAX_VALUE;
        int n=ranks.length;
        for(int i=0;i<n;i++) {
            min=Math.min(min,ranks[i]);
        }
        long tot=1L*min*cars*cars;
        long l=1,h=tot;
        long ans=0;
        while(l<=h) {
            long sum=0;
            long mid=l+(h-l)/2;
            for(int i=0;i<n;i++) {
                sum+=Math.sqrt(mid/ranks[i]);
            }
             if(sum>=cars) {
                ans=mid;
                h=mid-1;
            }
            else {
                l=mid+1;
            }
           
        }
        return ans;
    }
}