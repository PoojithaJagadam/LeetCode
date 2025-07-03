class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        int n=strs.length;
        if(strs ==  null || n==0)
            return "";
        for(int i=1;i<n;i++) {
            while(!strs[i].startsWith(ans)) {
               ans= ans.substring(0, ans.length()-1);
            }
        }
        return ans;
    }
}