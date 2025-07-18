class Solution {
    public long minimumDifference(int[] nums) {
       int size=nums.length;
       int n= size / 3;
       long sum=0;
       PriorityQueue<Integer> q1=new PriorityQueue<>(Comparator.reverseOrder());

       for(int i=0;i<n;i++) {
            sum+=nums[i];
            q1.add(nums[i]);
       }

       long[] ps=new long[size];
       ps[n-1] = sum;
       for(int i=n;i<size;i++) {
            if(nums[i] < q1.peek()) {
                sum =sum+ nums[i] - q1.poll();
                q1.add(nums[i]);
            }
            ps[i] = Math.min(ps[i-1], sum);

       }
       PriorityQueue<Integer> q2=new PriorityQueue<>();
       sum=0;
       for(int i=size-1; i>=size -n;i--) {
        sum+=nums[i];
        q2.add(nums[i]);
       }
       long[] ss=new long[size];
       ss[size-n] = sum;
       for(int i=size-n-1;i>=n;i--) {
            if(nums[i] > q2.peek()) {
                sum = sum+ nums[i] - q2.poll();
                q2.add(nums[i]);
            }
            ss[i] = Math.max(ss[i-1], sum);
       }
        
        long res=Long.MAX_VALUE;
        for(int i=n-1;i<size-n;i++) {
            res=Math.min(res, ps[i] -ss[i+1]);
        }
        return res;
    }
}