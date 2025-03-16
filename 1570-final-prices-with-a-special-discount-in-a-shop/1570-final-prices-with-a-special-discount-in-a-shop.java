class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] a=prices.clone();
        Stack<Integer> st=new Stack<>();
        int k=0;
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && prices[i]<=prices[st.peek()]) {
               a[st.pop()]-=prices[i];
            }
            st.add(i);
        }
        return a;
    }
}