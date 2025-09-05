class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        TreeSet<Integer> hash=new TreeSet<>();
        for(int i=0;i<n;i++) {
            hash.add(nums[i]);
        }
        int maxi=1, count=1;
        int k=hash.size();
        int[] ans=new int[k];
        int idx=0;
        for(int i: hash) {
            ans[idx++]=i;
        }
        for(int i=1;i<k;i++) {
            if(ans[i] - ans[i-1] == 1){
                count++;
                maxi = Math.max(maxi,count);
            }
            else 
                count=1;

        }
        return maxi;
    }
}