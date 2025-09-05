class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            int p1=i,p2=i;
            while(p1>=0 && p2<n && s.charAt(p1) == s.charAt(p2)) {
                if(p2-p1+1 > maxi) {
                    ans=s.substring(p1,p2+1);
                    maxi=p2-p1+1;
                }
                p1--;
                p2++;
            }
            p1=i-1;p2=i;
            while(p1>=0 && p2<n && s.charAt(p1) == s.charAt(p2)) {
                if(p2-p1+1 > maxi) {
                    ans=s.substring(p1,p2+1);
                    maxi=p2-p1+1;
                }
                p1--;
                p2++;
            }
        }
        return ans;
    }
}