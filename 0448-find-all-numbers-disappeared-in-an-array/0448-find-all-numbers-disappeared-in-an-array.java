class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        //Arrays.sort(nums);
       
        List<Integer> arr=new ArrayList<>();
        int[] a=new int[n+1];
        for(int i=0;i<n;i++) {
           a[nums[i]]++;
        }
        for(int i=1;i<n+1;i++) {
            if(a[i]==0) 
                arr.add(i);
        }
        return arr;
    }
}