class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l=0;
       int ans=0;
       int n=s.length();
        HashSet<Character> hash=new HashSet<>();
        for(int r=0;r<n;r++) {
            //  if hashset doesnot contain the incoming character then add it
            if(!hash.contains(s.charAt(r))) {
                hash.add(s.charAt(r));
            }
            else {
                // otherwise remove that charcter which is at the starting and add the current character to the end 
                while(hash.contains(s.charAt(r))) {
                    
                    hash.remove(s.charAt(l));
                    l++;
                }
                hash.add(s.charAt(r));
            }
            // update the answer
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}