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
     int length=0;
     ListNode curr=head;
     while(curr!=null){
        length++;
        curr=curr.next;
     }
     int target=length-n;
     if(target==0){
        head=head.next;
     }
      curr=head;
       ListNode prev=null;
       int count=0;
       while(curr!=null && count<target){
        prev=curr;
        curr=curr.next;
        count++;
       }
       if(prev!=null && curr!=null)
       prev.next=curr.next;
        return head;
    }
   
}
