class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int hill=0,valley=0;
        for(int i=1;i<n-1;i++) {
            if(nums[i-1] < nums[i] && nums[i] > nums[i+1] ) {
                hill++;
            }
            else if(nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                valley++;
            }
            else if(nums[i] == nums[i+1]) {
                nums[i] = nums[i-1];
            }
        }
        return hill+valley;

    }
}