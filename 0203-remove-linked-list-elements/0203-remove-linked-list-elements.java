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
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode crntNode=head;
        while(crntNode != null && crntNode.next!=null){
            if(crntNode.next.val==val){
                crntNode.next=crntNode.next.next;
            }else{
                crntNode=crntNode.next;
            }
        }
        return head;
    }
}