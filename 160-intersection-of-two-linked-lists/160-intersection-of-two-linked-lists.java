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
    public ListNode getIntersectionNode(ListNode A, ListNode B) {
       if(A== null || B==null) return null;
        ListNode a=A;
        ListNode b = B;
        while(a!=b){
            a=a==null? B : a.next;
             b=b==null? A : b.next;
        }
        return a;
        
    }
}