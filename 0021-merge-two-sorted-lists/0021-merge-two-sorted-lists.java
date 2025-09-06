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


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        ListNode p1=list1;
        ListNode p2=list2;
        ListNode dum= new ListNode(-1);
        ListNode res= dum;
        while(p1 != null && p2 != null) {
            if(p1.val <= p2.val) {
                dum.next = p1;
                p1 = p1.next;
                 
            }
            else {
                dum.next = p2;
                p2 = p2.next;
                 
            }
             dum = dum.next;
        }   
            if(p2 != null)
                p1=p2;
            while(p1 != null) {
                dum.next = p1;
                p1= p1.next;
                dum = dum.next;
            }
        
        return res.next;
    }
}