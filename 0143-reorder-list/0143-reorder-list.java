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

    
    static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) 
            return head;
        ListNode rh=reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rh;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        ListNode rh=reverse(slow);
        merge(head,rh);
    }
    static void merge(ListNode l1, ListNode l2) {
        
        while(l1 !=null && l2 !=null) {

            ListNode r1 = l1.next;
            ListNode r2= l2.next;
            l1.next = l2;
            if(r1 == null)
                break;
            l2.next = r1;
            l1 = r1;
            l2 = r2;
        }
        
    }
}