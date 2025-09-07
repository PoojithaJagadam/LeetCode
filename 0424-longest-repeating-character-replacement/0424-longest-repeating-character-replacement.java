class Solution {
    public int characterReplacement(String s, int k) {
        
        int n=s.length(), max=0,ans=0;
        int[] c=new int[26];
        int l=0;
        for(int r=0;r<n;r++) {
            char ch=s.charAt(r);
            c[ch - 'A']++;
            max = Math.max(max, c[ch - 'A']);
            if(r - l + 1 - max > k) {
                c[s.charAt(l) - 'A']--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}