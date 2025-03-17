class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++) {
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        for(int i: hash.values()) {
            if(i%2!=0) {
                return false;
            }
        }
        return true;
    }
}