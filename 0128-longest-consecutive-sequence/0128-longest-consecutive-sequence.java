class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<n;i++) {
            hash.add(nums[i]);
        }
        int k=hash.size();
        if(k==0)
            return 0;
       
        int[] ans=new int[hash.size()];
        int idx=0;
        for(int i: hash) {
            ans[idx++]=i;
        }
        
        int count=1, maxi=1;
        Arrays.sort(ans);
        for(int i=1;i<ans.length;i++) {
            if(ans[i] - ans[i-1] ==1) {
                count++;
                maxi=Math.max(count,maxi);
            }

            else count=1;
        }
        return maxi;
    }
}