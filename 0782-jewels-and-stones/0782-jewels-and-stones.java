class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int n1=jewels.length();
       int n2=stones.length();
        HashSet<Character> hash=new HashSet<>();
        for(int i=0;i<n1;i++) {
            hash.add(jewels.charAt(i));
        }
        int sum=0;
        for(int i=0;i<n2;i++) {
            if(hash.contains(stones.charAt(i)))
                sum++;
        }
       return sum;
    }

}