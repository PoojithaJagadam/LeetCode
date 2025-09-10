class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String , List<String>> hash=new HashMap<>();
        for(String word : strs) {
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String word1 = new String(ch);
            if(!hash.containsKey(word1)) {
                hash.put(word1, new ArrayList<>());
            }
            hash.get(word1).add(word);
        }
        return new ArrayList<>(hash.values());
    }
}