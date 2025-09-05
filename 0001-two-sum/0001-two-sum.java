class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> hash=new HashMap<>();
       int n=nums.length;
       for(int i=0;i<n;i++) {
                hash.put(nums[i],i);
       }
       int[] b=new int[2];
       for(int i=0;i<n;i++) {
        int diff=target - nums[i];
        if(hash.containsKey(diff) && hash.get(diff) != i){
            b[0]=i;
            b[1]=hash.get(diff);
        }

       }
       
       return b;
    }
}