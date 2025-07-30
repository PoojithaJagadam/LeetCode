class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=stones.length();
        int m=jewels.length();
        int c=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(stones.charAt(i)==jewels.charAt(j)) {
                    c++;
                }
            }
        }
        return c;
    }
}