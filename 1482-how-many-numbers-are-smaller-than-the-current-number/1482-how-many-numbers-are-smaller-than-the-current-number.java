class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cnt=new int[101];
        int n=nums.length;
        for(int i=0;i<n;i++) {
            cnt[nums[i]]++;
        }
       
        int[] pre=new int[101];
        pre[0]=cnt[0];
        for(int i=1;i<101;i++) {
            pre[i]=pre[i-1]+cnt[i];
         
        }
       
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            if(nums[i]!=0)
             arr[i]=pre[nums[i]-1];
            else
             arr[i]=0;
        }
        return arr;
    }
}