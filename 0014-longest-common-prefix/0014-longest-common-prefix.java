class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        int n=strs.length;
        // first ans manam first string ki assign cheskovali
        // ans= flower
        if(strs ==  null || n==0)
            return "";
        // now comparison starts with second string
        // if flow does not startswith flower then remove the last character of ans string and compare until it matches with some substring

        /*        TRACING
           ans= flower
           strs[i]= flow;
           flow not stratswith flower
           so
                ans=flowe
                repeat
                    flow not startwith flowe
                        ans=flow
                    flow startswith flow
                        out of the loop
            likewise for flight
                flight not stratswith flow
                    ans=flo
                    flight not startswith flo
                        ans=fl
                        flight startswith fl
                            out of the loop
             return
            
        */
        for(int i=1;i<n;i++) {
            while(!strs[i].startsWith(ans)) {
               ans= ans.substring(0, ans.length()-1);
            }
        }
        return ans;
    }
}