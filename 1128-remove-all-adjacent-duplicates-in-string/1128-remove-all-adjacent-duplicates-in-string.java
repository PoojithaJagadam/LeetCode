class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++) {
           if(!st.isEmpty() && s.charAt(i)==st.peek()) {
            st.pop();
           }
           else {
            st.push(s.charAt(i));
           }
        }
        StringBuilder str=new StringBuilder();
       while(!st.isEmpty()) {
        str.append(String.valueOf(st.pop()));
       }
       return str.reverse().toString();
    }
}