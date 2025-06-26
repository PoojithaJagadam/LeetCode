class Solution {
    public int longestSubsequence(String s, int k) {
       int n=s.length();
       int count=0;
       for(char c: s.toCharArray()) {
            if(c=='0') count++;
       }
       int val = 0;
       int pow = 1;
        for(int i=n-1;i>=0;i--) {
                if(s.charAt(i) == '1') {
                    if(pow>k) break;
                    if(val +pow <= k) {
                        val+=pow;
                        count++;
                    }
                }
                if(pow<=k)
                    pow*=2;
        }
       return count;
    }
}