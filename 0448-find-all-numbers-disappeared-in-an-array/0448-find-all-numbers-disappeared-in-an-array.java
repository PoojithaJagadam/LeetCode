class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        //Arrays.sort(nums);
        HashSet<Integer> hash=new HashSet<>();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++) {
           hash.add(nums[i]);
        }
        for(int i=1;i<=n;i++) {
            if(!hash.contains(i))
                arr.add(i);
        }
        return arr;
    }
}