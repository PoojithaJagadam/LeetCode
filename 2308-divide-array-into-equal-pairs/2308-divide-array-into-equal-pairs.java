class Solution {
    public boolean divideArray(int[] nums) {
        // HashMap<Integer,Integer> hash=new HashMap<>();
        int[] count=new int[501];
        int n=nums.length;
        for(int i=0;i<n;i++) {
            //hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
            count[nums[i]]++;
        }
        // for(int i: hash.values()) {
        //     if(i%2!=0) {
        //         return false;
        //     }
        // }
        for(int i=0;i<501;i++) {
            if(count[i]%2!=0)
                return false;
        }
        return true;
    }
}