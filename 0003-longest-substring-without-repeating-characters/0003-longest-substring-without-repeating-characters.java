class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l=0;
       int ans=0;
       int n=s.length();
        HashSet<Character> hash=new HashSet<>();
        for(int r=0;r<n;r++) {
            if(!hash.contains(s.charAt(r))) {
                hash.add(s.charAt(r));
            }
            else {
                while(hash.contains(s.charAt(r))) {
                    
                    hash.remove(s.charAt(l));
                    l++;
                }
                hash.add(s.charAt(r));
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}