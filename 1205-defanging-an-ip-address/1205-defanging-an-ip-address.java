class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        int n=address.length();
        for(int i=0;i<n;i++) {
            if(address.charAt(i)=='.') {
                ans+="[.]";
            }
            else {
                ans+=address.charAt(i);
            }
        }
        return ans;
        
    }
}