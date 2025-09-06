class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       Set<List<Integer>> ans=new HashSet<>();
       for(int i=0;i<n;i++) {
            int p1=i+1, p2=n-1;
            while(p1<p2) {
                int sum= nums[i] + nums[p1] + nums[p2];
                if(sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    p1++;
                    p2--;
                }
                else if(sum < 0) 
                    p1++;
                else 
                    p2--;
            }
        }
        return new ArrayList<>(ans);
    }
}