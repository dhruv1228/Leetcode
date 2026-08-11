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
        Stack<Integer> stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(-1);
        temp=dummy;
        while(!stack.isEmpty()){
            dummy.next=new ListNode(stack.pop());
            dummy=dummy.next;
        }
        return temp.next;
    }
}