class Solution {
    public long countOfSubstrings(String word, int k) {
        if(word.length()<(5+k)){
            return 0;
        }
        return count(word,k)-count(word,k+1);
    }
    private long count(String word,int k){
        long ans=0;
        int cons=0,l=0;
        Map<Character,Integer> hash=new HashMap<>();
        for(int r=0;r<word.length();r++){
            char ch=word.charAt(r);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                hash.put(ch,hash.getOrDefault(ch,0)+1);
            }
            else{
                cons++;
            }
            while(hash.size()==5 && cons>=k){
                ans+=word.length()-r;
                char lch=word.charAt(l++);
                if(lch=='a' || lch=='e' || lch=='i' || lch=='o' || lch=='u'){
                    hash.put(lch,hash.get(lch)-1);
                    if(hash.get(lch)==0){
                        hash.remove(lch);
                    }
                }
                else{
                    cons--;
                }
            }
        }
        return ans;
    }
}