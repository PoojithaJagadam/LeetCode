class Solution {
    static int digit(int n) {
        int c=0;
        while(n>0) {
            int rem=n%10;
            c++;
            n/=10;
        }
        return c;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if(digit(nums[i])%2==0) {
                count++;
            }
        }
        return count;
    }
}