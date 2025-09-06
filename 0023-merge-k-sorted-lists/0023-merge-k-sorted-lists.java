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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=lists.length;
        for(int i=0;i<n;i++) {
            ListNode head= lists[i];
            while(head != null) {
                arr.add(head.val);
                head=head.next;
            }
        }
        Collections.sort(arr);
        ListNode dum=new ListNode(-1);
        ListNode temp=dum;
        for(int i=0;i<arr.size();i++) {
            ListNode node=new ListNode(arr.get(i));
            dum.next=node;
            dum=dum.next;
        }
        return temp.next;
    }
}