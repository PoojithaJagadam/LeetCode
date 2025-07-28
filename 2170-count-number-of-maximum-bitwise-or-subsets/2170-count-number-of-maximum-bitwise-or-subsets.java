class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++) {
            k|=nums[i];
        }
        int count=0;
        HashMap<Integer, Integer> hash=new HashMap<>();
        for(int i=0;i<(1<<n);i++) {
            int ans=0;
            for(int j=0;j<31;j++) {
                if(((i>>j) &1) ==1) {
                    ans|=nums[j];
                }
            }
            if(ans==k)
                count++;
          

        }
        
        return count;
    } 
}