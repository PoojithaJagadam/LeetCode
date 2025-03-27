class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n=nums.size();
        HashMap<Integer, Integer> hash=new HashMap<>();
         HashMap<Integer, Integer> hash1=new HashMap<>();
        for(int i: nums) {
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        for(int i=0;i<n;i++) {
            int k=nums.get(i);
            hash.put(k,hash.get(k)-1);
            hash1.put(k,hash1.getOrDefault(k,0)+1);
            if(hash1.get(k)*2 > (i+1) && hash.get(k)*2 > n-i-1) {
                return i;
            }
        }
        return -1;
    }
}