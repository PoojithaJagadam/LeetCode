class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        int[] ps=new int[n];
        int[] ss=new int[n];
        ps[0]=nums[0];
        ss[n-1]=nums[n-1];
        for(int i=1;i<n;i++) {
            ps[i]=Math.max(ps[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--) {
            ss[i]=Math.max(ss[i+1],nums[i]);
        }
        long ans=0;
        for(int i=1;i<n-1;i++) {
            ans=Math.max(ans,(long)((long)(ps[i-1]-nums[i])*ss[i+1]));
        }
        // for(int i=0;i<n;i++) {
        //     System.out.print(ps[i]+" ");
        // }
        // System.out.println();
        // for(int i=0;i<n;i++) {
        //     System.out.print(ss[i]+" ");
        // }
        return ans;
    }
}