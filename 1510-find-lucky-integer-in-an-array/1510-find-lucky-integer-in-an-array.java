class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        /*HashMap<Integer, Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;
        for(int i: hash.keySet()) {
            if(i==hash.get(i)) {
                ans= Math.max(ans,i);
            }
        }
        return ans; */
        int[] c=new int[501];
        //Arrays.fill(0,c);
        for(int i=0;i<n;i++) {
            c[arr[i]]+=1;
        }
        int ans=-1;
        
        for(int i=1;i<=500;i++) {
            if(i== c[i]) {
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}