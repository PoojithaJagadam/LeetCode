class Solution {

    public int numberOfSubstrings(String s) {
         int n=s.length();
        int l=0,ans=0;
        HashMap<Character,Integer> hash=new HashMap<>();
        for(int r=0;r<n;r++) {
            hash.put(s.charAt(r),hash.getOrDefault(s.charAt(r),0)+1);
            while(hash.getOrDefault('a',0)>=1 && hash.getOrDefault('b',0)>=1 && hash.getOrDefault('c',0)>=1) {
                ans+=n-r;
                hash.put(s.charAt(l),hash.get(s.charAt(l))-1);
                if(hash.get(s.charAt(l))==0) {
                    hash.remove(s.charAt(l));
                }
                l++;
            }
        }
        return ans;
    }
}