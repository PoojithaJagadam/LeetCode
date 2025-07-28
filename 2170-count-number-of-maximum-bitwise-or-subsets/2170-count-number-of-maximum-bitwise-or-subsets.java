class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n=nums.length;
        int k=0;
        //total bitwise-or is the max of array
        for(int i=0;i<n;i++) {
            k|=nums[i];
        }
        int count=0;
        //Generating all possible subsets
        for(int i=0;i<(1<<n);i++) {
            int ans=0;
            for(int j=0;j<31;j++) {
                if(((i>>j) &1) ==1) {
                    ans|=nums[j];
                }
            }
            //if it matches then increment count
            if(ans==k)
                count++;
          

        }
        
        return count;
    } 
}