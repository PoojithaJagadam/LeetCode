class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hash1=new HashMap<>();
        
        int n=s.length();
        for(int i=0;i<n;i++) {
            hash1.put(s.charAt(i), hash1.getOrDefault(s.charAt(i),0)+1);
        }
        int sum=0;
        int maxi=0;
        boolean hasOddfreq=false;
        for(int i: hash1.values()) {
            if(i%2!=0) {
                sum+=i-1;
                hasOddfreq=true;
            }
                
            else 
                sum+=i;
        }
        return hasOddfreq == true ? sum+1: sum;
    }
}