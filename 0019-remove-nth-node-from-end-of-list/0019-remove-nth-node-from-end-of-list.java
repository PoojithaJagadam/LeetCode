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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //     ListNode temp=head;
    //     int count=0;
    //     while(temp!=null) {
    //         count++;
    //         temp=temp.next;
    //     }
    //     int pos=count-n;
    //     if(pos==0) {
    //         return head.next;
    //     }
    //     else {
    //         ListNode temp1=head;
    //         for(int i=0;i<pos-1;i++) {
    //             temp1=temp1.next;
    //         }
    //         temp1.next=temp1.next.next;
    //         return head;
    //     }
    //    // return head
    
    ListNode dum=new ListNode(-1);
    ListNode slow=dum;
    ListNode fast=dum;
    slow.next=head;
    for(int i=0;i<=n;i++) {
        fast=fast.next;
    }

    while(fast!=null) {
        slow=slow.next;
        fast=fast.next;
    }
    slow.next=slow.next.next;
    return dum.next;
    }
}