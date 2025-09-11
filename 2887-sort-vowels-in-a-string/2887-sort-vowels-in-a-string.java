class Solution {
    public String sortVowels(String s) {
        char ch[]= s.toCharArray();
        int n=ch.length;
        List<Character> vowel = new ArrayList<>();
       // char c[]=new char[n];
        ArrayList<Character> arr=new ArrayList<>();
        arr.add('A');
        arr.add('E');
        arr.add('I');
        arr.add('O');
        arr.add('U');
        arr.add('a');
        arr.add('e');
        arr.add('i');
        arr.add('o');
        arr.add('u');
        for(int i=0;i<n;i++) {
            if(arr.contains(ch[i])) {               
                vowel.add(ch[i]);
                ch[i]='$';    
            }          
        }
        Collections.sort(vowel);
       /* for(int i=0;i<vowel.size();i++) {
            System.out.print(vowel.get(i) +" ");
        }*/
       /* for(int i=0;i<n;i++) {
            System.out.print(ch[i] +" ");
        } */
        int p=0;
        for(int i=0;i<n;i++) {
            if( ch[i] == '$') {
                ch[i] = vowel.get(p);
                p++;
            }
        }
        String str = new String(ch);
        return str;
    }
}