class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cnt=new int[101];
        int n=nums.length;
        for(int i=0;i<n;i++) {
            cnt[nums[i]]++;
        }
       
        for(int i=1;i<101;i++) {
            cnt[i]+=cnt[i-1];
         
        }
       
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            if(nums[i]==0)
                arr[i]=0;
            else
                arr[i]=cnt[nums[i]-1];
        }
        return arr;
    }
}