class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        int p1=0;
        while(p1<=(n-3)) {
            if( nums[p1]==0) {
                nums[p1]^=1;
                nums[p1+1]^=1;
                nums[p1+2]^=1;
                count++;
               
            }
            p1++;
        }
        int sum=0;
       
        for(int i=0;i<n;i++) {
            System.out.print(nums[i]+" ");
            sum+=nums[i];
        }
        if(sum==n) 
            return count;
        else 
            return -1;
    }
}