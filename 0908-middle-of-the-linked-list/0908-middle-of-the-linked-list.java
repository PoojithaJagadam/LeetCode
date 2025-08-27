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
       int size=0;
       ListNode temp=head;
       while(temp.next!=null) {
        size++;
        temp=temp.next;
       }
       ListNode ans=head;
       for(int i=1;i<=(size/2);i++) {
        ans=ans.next;
       }
       return (size%2==0 )? ans: ans.next;
    }
}