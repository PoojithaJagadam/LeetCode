class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i],0) +1);
        }
        int ans=0;
        for(int i: hash.keySet()) {
            if(hash.get(i)> (n/2)) {
                ans=i;
                break;
            }
        }
        return ans;
    }
}