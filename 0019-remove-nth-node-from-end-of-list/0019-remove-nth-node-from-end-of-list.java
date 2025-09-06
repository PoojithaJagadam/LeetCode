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
    ListNode temp=head;
    int size=0;
    while(temp != null) {
        size++;
        temp=temp.next;
    }

    int tot= size - n;
    if(tot == 0)
        return head.next;
    else {
    ListNode ans=head;
    ListNode hi = ans;
    for(int i=0;i<tot-1;i++) {
       
        ans=ans.next;
    }
    ans.next = ans.next.next;
    return head;
    }
    }
}