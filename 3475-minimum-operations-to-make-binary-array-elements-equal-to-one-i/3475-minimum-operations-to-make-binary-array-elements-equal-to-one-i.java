class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<(n-2);i++) {
            if(nums[i]==0) {
                nums[i]=1-nums[i];
                nums[i+1]=1-nums[i+1];
                nums[i+2]=1- nums[i+2];
                count++;
            }
        }
       
        int sum=0;
       
        for(int i=0;i<n;i++) {
            //System.out.print(nums[i]+" ");
            sum+=nums[i];
        }
        return (sum==n)? count: -1;
    }
}