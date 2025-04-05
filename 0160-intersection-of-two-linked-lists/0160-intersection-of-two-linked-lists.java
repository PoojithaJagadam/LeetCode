/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        // HashSet<ListNode> hash=new HashSet<>();
        // while(headA!=null) {
        //     hash.add(headA);
        //     headA=headA.next;
        // }
        // while(headB!=null) {
        //     if(hash.contains(headB)) {
        //         return headB;
        //     }
        //     headB=headB.next;
        // }
        // return null;

        int n=0,m=0;
        ListNode tempA=headA;
        while(tempA!=null) {
            n++;
            tempA=tempA.next;
        }
        ListNode tempB=headB;
        while(tempB!=null) {
            m++;
            tempB=tempB.next;
        }
        int tot=Math.abs(n-m);
        if(n>m) {
            while(tot>0) {
                headA=headA.next;
                tot--;
            }
        }
        else {
            while(tot>0) {
                headB=headB.next;
                tot--;
            }
        }
        while(headA!=null && headB!=null) {
            if(headA==headB) {
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}