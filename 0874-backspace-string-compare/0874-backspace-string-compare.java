class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        int n1=s.length(),n2=t.length();
       
        
            for(int i=0;i<n1;i++) {
                if(!st1.isEmpty() && s.charAt(i)=='#') {
                    st1.pop();
                    
                }
                else if(st1.isEmpty() && s.charAt(i)=='#'){
                    continue;
                }
                else {

                    st1.push(s.charAt(i));
                }
            }
            for(int i=0;i<n2;i++) {
                if(!st2.isEmpty() && t.charAt(i)=='#') {
                    st2.pop();
                    
                }
                else if(st2.isEmpty() && t.charAt(i)=='#'){
                    continue;
                }
                else {
                    st2.push(t.charAt(i));
                }
            }
            String res1="";
            String res2="";
            while(!st1.isEmpty()) {
                res1+=st1.pop();
            }
             while(!st2.isEmpty()) {
               res2+=st2.pop();
            }
            return res1.equals(res2);
        
      //  return true;
    }
}