class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int c=0;
       HashSet<Character> hash=new HashSet<>();
       int n=jewels.length();
       for(int i=0;i<n;i++) {
        hash.add(jewels.charAt(i));
       }
       int m=stones.length();
       for(int i=0;i<m;i++) {
            if(hash.contains(stones.charAt(i))) {
                c++;
            }
       }
       return c;
    }

}