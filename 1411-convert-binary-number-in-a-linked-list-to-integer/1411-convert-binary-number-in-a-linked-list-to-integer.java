/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
       Stack<Integer> st=new Stack<>();
       int sum=0;
       while(head!=null) {
            st.push(head.val);
            head=head.next;
       }
       int i=0;
       while(!st.isEmpty()) {
        sum+=(st.pop() * (1<<i++));
       }
       return sum;
    }
}