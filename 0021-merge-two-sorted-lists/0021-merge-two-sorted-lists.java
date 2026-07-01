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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> ans=new ArrayList<>();
        ListNode temp=list1;
        while(list1!=null){
            ans.add(list1.val);
            list1=list1.next;
        }
        temp=list2;
        while(list2!=null){
            ans.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(ans);
        ListNode head=new ListNode(-1);
        temp=head;
        for(int i=0;i<ans.size();i++){
            ListNode node=new ListNode(ans.get(i));
            temp.next=node;
            temp=temp.next;
        }
        return head.next;
    }
}