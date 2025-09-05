class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int n=s.length(), ans=0;
        HashSet<Character> hash=new HashSet<>();
        for(int i=0;i<n;i++) {
            if(!hash.contains(s.charAt(i))) {
                hash.add(s.charAt(i));
            }
            else {
                while(hash.contains(s.charAt(i))) {
                    hash.remove(s.charAt(l));
                    l++;
                }
                hash.add(s.charAt(i));
            }
            ans = Math.max(ans, i-l+1);
        }
        return ans;
    }
}