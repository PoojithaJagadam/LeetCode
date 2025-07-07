class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hash1=new HashMap<>();
        HashMap<String, Character> hash2=new HashMap<>();
        int n1=pattern.length();
        int n2=s.length();
        String[] words=s.split(" ");
        if(n1 != words.length) 
            return false;
        for(int i=0;i<n1;i++) {
            char s1=pattern.charAt(i);
            String word= words[i];

            if(!hash1.getOrDefault(s1, word).equals(word)) 
                return false;
            if(!hash2.getOrDefault(word,s1).equals(s1)) 
                return false;
            hash1.put(s1,word);
            hash2.put(word,s1);
        }
        return true;
    }
}