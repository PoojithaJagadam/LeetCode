class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=1;
        for(int i=1;i<n;i++) {
            // adjacent elements same unte continue
            if(nums[i] == nums[i-1]) 
                continue;
                // else distinct element ni mundhuku thiskaravali
            else {
                nums[k++]=nums[i];
            }
        }
      
        return k;
    }
}