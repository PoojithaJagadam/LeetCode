class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
         int l=0,ans=0;
         HashMap<Integer,Integer> hash=new HashMap<>();
         for(int r=0;r<n;r++) {
                int k=fruits[r];
                hash.put(k,hash.getOrDefault(k,0)+1);
                while(hash.size()>2){
                    int m=fruits[l];
                    hash.put(m,hash.get(m)-1);
                    if(hash.get(m)==0) {
                        hash.remove(m);
                    }
                    l++;
                }
                ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}