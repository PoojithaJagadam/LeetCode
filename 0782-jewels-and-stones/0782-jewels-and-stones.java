class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int n1=jewels.length();
       int n2=stones.length();
       HashMap<Character, Integer> hash=new HashMap<>();
       for(int i=0;i<n2;i++) {
            hash.put(stones.charAt(i), hash.getOrDefault(stones.charAt(i),0)+1);
       }
       int sum=0;
       for(int i=0;i<n1;i++) {
            char c=jewels.charAt(i);
            if(hash.containsKey(c))
                sum+=hash.get(c);
       }
       return sum;
    }

}