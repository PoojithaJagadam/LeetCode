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

    /*public static ListNode merge(ListNode p1 , ListNode p2){
        // ListNode p1=list1;
        // ListNode p2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode td=dummy;
        while(p1!=null && p2!=null) {
            if(p1.val<p2.val) {
                dummy.next=p1;
                p1=p1.next;
                
            }
            else {                
                dummy.next=p2;
                p2=p2.next;
               
            }
            dummy=dummy.next;
        }
       if(p1!=null) dummy.next=p1;
        if(p2!=null) dummy.next=p2;
        return td.next;
    }

    public static ListNode findMid(ListNode head) {
        //ListNode temp=head;
         ListNode slow=head,fast=head;
         while(fast.next!= null && fast.next.next!=null) {   
                 slow= slow.next;
                 fast= fast.next.next;    
         }
         return slow;
    } */
    public ListNode sortList(ListNode head) {
        
       /*  if(head==null || head.next==null) {
            return head;
         }
          ListNode mid=findMid(head);
         ListNode sh=mid.next;
         mid.next=null;
         return merge(sortList(head),sortList(sh));*/
           
       ListNode temp=head;
       int n=0;
       while(temp!=null) {
           n++;
           temp=temp.next;
       }
       int[] a=new int[n];
       int i=0;
       ListNode temp1=head;
       while(temp1!=null) {
           a[i]=temp1.val;
           i++;
           temp1=temp1.next;
       }
       Arrays.sort(a);
       i=0;
       ListNode dum=head;
       while(dum!=null) {
           dum.val=a[i++];
           dum=dum.next;
       }
       return head;
    }
}