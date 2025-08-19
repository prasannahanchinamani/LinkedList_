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
    public ListNode rotateRight(ListNode head, int k) {
        int count=0;
        if(head==null ||head.next==null||k==0)
        return head;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        k=k%count;
        if(k==0)
        return head;
        count-=k;
        ListNode prev=null;
        temp=head;
        while(count!=0){
         prev=temp;
         temp=temp.next;
            count--;
        }
        prev.next=null;
        ListNode tail=temp;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next = head;
        return temp;
    }
}
