class Solution {

    static boolean isPalindrome(String str) {
        int n=str.length();
        int p1=0,p2=n-1;
        while(p1<p2) {
            if(str.charAt(p1) != str.charAt(p2))
                return false;
            else {
                p1++;
                p2--;
            }
        }
        return true;
    }
    public int countSubstrings(String s) {
        int n=s.length(),count=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                
                String str=s.substring(i,j+1);
                if(isPalindrome(str)) {
                    count++;
                }
                
            }
        }
        return count+n;
    }
}