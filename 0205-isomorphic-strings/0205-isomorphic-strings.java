class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hash1=new HashMap<>();
        HashMap<Character, Character> hash2=new HashMap<>();
        int n1=s.length();
        boolean ans=true;
        for(int i=0;i<n1;i++) {
            char sch=s.charAt(i);
            char tch=t.charAt(i);
            if(!hash1.containsKey(sch) && !hash2.containsKey(tch)) {
                hash1.put(sch,tch);
                hash2.put(tch,sch);
            }
            else if(hash1.containsKey(sch) && hash1.get(sch)!=tch || 
                    hash2.containsKey(tch) && hash2.get(tch)!=sch) {
                        ans=false;
                        break;
            }
        }
        return ans;
    }
}