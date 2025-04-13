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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode even=new ListNode(-1);
        ListNode even1=even;
        ListNode odd=new ListNode(-1);
        ListNode odd1=odd;
        ListNode temp=head;
        while(temp!=null) {
            odd.next=temp;
            odd=odd.next;
            temp=temp.next;
            if(temp!=null) {
            even.next=temp;
            even=even.next;
            temp=temp.next;
            }

        }
        
        even.next=null;
        odd.next=even1.next;
        return odd1.next;

    }
}