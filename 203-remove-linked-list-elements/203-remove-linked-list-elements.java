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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
       ListNode temp=new ListNode(-1);
        temp.next=head;
        ListNode t=temp;
        while(t!=null && t.next!=null)
        {
            if(t.next.val==val)
            {   
                t.next=t.next.next;
            }
            else
                t=t.next;
        }
        return temp.next;
    }
}