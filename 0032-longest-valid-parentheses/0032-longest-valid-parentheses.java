class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int ans=0;
        for(int i=0;i<n;i++) {
            if(!st.isEmpty() && s.charAt(i) == ')') {
                st.pop();
                if(st.isEmpty()) {
                    st.push(i);
                }
                else {
                    int curr=i-st.peek();
                    ans=Math.max(ans,curr);
                }
            }
            else if(s.charAt(i) == '(') {
                st.push(i);
            }
            
        }
        
        return ans;
    }
}