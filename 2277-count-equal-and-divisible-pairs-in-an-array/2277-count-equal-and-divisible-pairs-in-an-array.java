class Solution {
    public int countPair(int[] nums,int k,int i)  {
        int n=nums.length;
        
        if(i>=n) 
            return 0;
        int c=0;
        for(int j=i+1;j<n;j++) {
            if(nums[i]==nums[j] && (i*j)%k==0) {
                c++;
            }
        }
        return c+countPair(nums,k,i+1);
    }
    public int countPairs(int[] nums, int k) {
        // int n=nums.length;
        // int c=0;
        // for(int i=0;i<n;i++) {
        //     for(int j=i+1;j<n;j++) {
        //         if(nums[i]==nums[j] && (i*j)%k==0) {
        //             c++;
        //         }
        //     }
        // }
        // return c;
        return countPair(nums,k,0);
    }
}