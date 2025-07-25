class Solution {
    public int maxSum(int[] nums) 
    {
        int n=nums.length;
       int maxi=Integer.MIN_VALUE;
       HashSet<Integer> hash=new HashSet<>();
        for(int i: nums) {
            hash.add(i);
        }
        int sum=0;
        for(int i: hash) {
            if(i>0) {
                sum+=i;
            }
            else 
                maxi=Math.max(maxi,i);
        }
        if(sum > 0) 
            return Math.max(sum,maxi);
        else
            return maxi;
    }
}