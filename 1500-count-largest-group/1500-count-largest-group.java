class Solution {
   
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> hash=new HashMap<>();
        int ans=0;
        for(int i=1;i<=n;i++) {
             int sum=0; 
             int k=i;
            while(k>0) {
                int r=k%10;
                sum+=r;
                k/=10;
            }
            hash.put(sum,hash.getOrDefault(sum,0)+1);
            ans=Math.max(ans,hash.get(sum));
        }
        int c=0;
        for(int i: hash.values()) {
            if(i==ans) 
                c++;
        }
        return c;

    }
}