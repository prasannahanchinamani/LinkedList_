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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
    //     ListNode prev=null;
    //       ListNode next=null;
    //       while(curr!=null){
    //         next=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next;
    //       }

    //    return prev;
        int i=0;
        int count=0;
        while(curr!=null){
           count++;
         curr=curr.next;
        }
         int arr[]=new int[count];
        int n=arr.length-1;
        curr=head;
        while(curr!=null){
            arr[i++]=curr.val;
        //     curr.val=arr[i];
        //     i++;
        //     n--;
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            curr.val=arr[n--];
            curr=curr.next;
        }
        return head;
        // return curr;
    }
}
