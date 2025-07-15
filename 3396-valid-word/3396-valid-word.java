class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3) 
            return false;
        boolean flag1=false;
        boolean flag2=false;
        boolean flag3=false;
        HashSet<Character> hash=new HashSet<>();
        hash.add('A');
        hash.add('E');
        hash.add('I');
        hash.add('O');
        hash.add('U');
        hash.add('a');
        hash.add('e');
        hash.add('i');
        hash.add('o');
        hash.add('u');
        int vowel=0, cons=0,num=0,spcl=0;
        for(int i=0;i<n;i++) {
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                if(hash.contains(word.charAt(i))) {
                    vowel++;
                    //flag1= true;
                    
                }
                else {
                    cons++;
                }
            }
            else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                if(hash.contains(word.charAt(i))) {
                    vowel++;
                }
                else {
                    cons++;
                }
                
            }
            else if(word.charAt(i) >= '0' && word.charAt(i) <= '9') {
               num++;
               
            }
            else {
                spcl++;
            }
        }
        if(vowel>=1 && cons>=1 && spcl==0)
            return true;
        return false;

    }
}