class Solution {
    public boolean canJump(int[] nums) {
        int c=0;
        int n=nums.length;
        int i=0;
        while(i<n) {
            if(i>c) return false;
            c=Math.max(c,i+nums[i]);
            i++;
        }
        return true;
    }
}