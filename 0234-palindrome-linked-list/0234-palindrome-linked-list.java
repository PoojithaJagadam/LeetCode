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

    static ListNode reverse(ListNode temp) {
        if(temp==null || temp.next==null) 
            return temp;
        ListNode k=reverse(temp.next);
        temp.next.next=temp;
        temp.next=null;
        return k;
    }
   
    public boolean isPalindrome(ListNode head) {
      /*Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null) {
            st.push(temp.val);
            temp=temp.next;
        }
        ListNode temp1=head;
        while(temp1!=null) {
            if(temp1.val!=st.pop()) 
                return false;
            temp1=temp1.next;
        }
       return true; */
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode rh=reverse(slow);
       slow.next=null;
       while(rh!=null) {
            if(head.val!=rh.val)
                return false;
                head=head.next;
                rh=rh.next;
        }
        return true;
    }
}