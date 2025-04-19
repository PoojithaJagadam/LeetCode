class Solution {

    public long atmost(int[] nums,int k) {
         int n=nums.length;
          long c=0;
          int p1=0;
          int p2=n-1;
          while(p1<p2) {
            if(nums[p1]+nums[p2]<k) {
                c+=(p2-p1);
                p1++;
            }
            else {
                p2--;
            }
          }
          return c;

    }
    public long countFairPairs(int[] nums, int lower, int upper) {
       
       
        Arrays.sort(nums);
        return atmost(nums,upper+1)-atmost(nums,lower);
    }
}