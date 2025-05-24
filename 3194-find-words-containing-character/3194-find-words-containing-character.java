class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++) {
            String word=words[i];
            int k=word.length();
            for(int j=0;j<k;j++) {
                if(word.charAt(j) == x) {
                    arr.add(i);
                    break;
                }
            }
        }
        return arr;
    }
}