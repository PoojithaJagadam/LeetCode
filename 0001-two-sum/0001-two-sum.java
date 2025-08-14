class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer, Integer> hash=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++) {
            hash.put(nums[i],i);
        }
        for(int i=0;i<n;i++) {
            if(hash.containsKey(target-nums[i]) && hash.get(target -nums[i]) !=i) {
                ans[0]=i;
                ans[1]=hash.get(target-nums[i]);
               
            }
        }
        return ans;
    }
}