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
    public ListNode reverse(ListNode temp) {
        if(temp==null || temp.next==null) {
            return temp;
        }
        ListNode rh=reverse(temp.next);
        temp.next.next=temp;
        temp.next=null;
        return rh;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode d=null;
       ListNode p1=l1;
       ListNode p2=l2;
       int sum=0,c=0;
       while(p1!=null || p2!=null) {
        sum=(p1==null? 0 : p1.val);
        sum+=(p2==null ? 0 : p2.val);
        sum+=c;
        ListNode nn=new ListNode(sum%10);
        nn.next=d;
        d=nn;
        c=sum/10;
        if(p1!=null) 
            p1=p1.next;
        if(p2!=null) 
            p2=p2.next;
        if(p1==null && p2==null && c!=0) {
            nn=new ListNode(c);
            nn.next=d;
            d=nn;
        }
       
       }
       return reverse(d);
    }
}