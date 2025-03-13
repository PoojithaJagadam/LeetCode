class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int k=queries.length;
        int n=nums.length;
        int sum=0;
        int pos=0;
        int[] diff=new int[n+1];
        for(int i=1;i<=n;i++) {
            diff[i]=0;
        }
        for(int i=0;i<n;i++) {
            while(sum + diff[i]<nums[i]) {
                if(pos==k)
                    return -1;
                int l=queries[pos][0];
                int r=queries[pos][1];
                int val=queries[pos][2];
                pos++;
                if(r<i)
                    continue;
                diff[Math.max(l,i)]+=val;
                diff[r+1]-=val;
            
            }
            sum+=diff[i];
            
        }
        return pos;
    }
}