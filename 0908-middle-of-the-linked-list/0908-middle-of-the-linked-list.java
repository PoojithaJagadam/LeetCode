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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null) {
            size++;
            temp=temp.next;
        }
        int median=0;
        median=(size/2);
        ListNode temp1=head;
        for(int i=0;i<median;i++) {
            temp1=temp1.next;
        }
        return temp1;
    }
}