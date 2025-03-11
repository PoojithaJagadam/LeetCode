class Solution {

    public int numberOfSubstrings(String s) {
         int n=s.length(),ans=0;
         int a=-1,b=-1,c=-1;
         for(int i=0;i<n;i++) {
            if(s.charAt(i)=='a') a=i;
            else if(s.charAt(i)=='b') b=i;
            else c=i;
            ans+=1+Math.min(Math.min(a,b),c);
         } 
        return ans;
    }
}