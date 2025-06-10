class Solution {
    public int maxDifference(String s) {
        int n=s.length();
         HashMap<Character, Integer> hash =new HashMap<>();
        // HashMap<Character, Integer> even =new HashMap<>();
        for(int i=0;i<n;i++) {
            char ch=s.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }
        int a=Integer.MIN_VALUE,b=Integer.MAX_VALUE;
        for(int i:hash.values()) {
            if(i%2==0) {
                b=Math.min(b,i);
            }
            else
                a=Math.max(a, i);
        }
        return a-b;
    }
}