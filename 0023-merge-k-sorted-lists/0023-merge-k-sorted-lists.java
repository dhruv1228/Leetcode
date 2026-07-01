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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode ans=lists[0];
        for(int i=1;i<lists.length;i++){
            ans=fun(ans,lists[i]);
        }
        return ans;
    }
    ListNode fun(ListNode list1,ListNode list2){
        ListNode head=new ListNode(-1);
        ListNode temp=head;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }
        if(list1!=null){
            temp.next=list1;
            temp=temp.next;
        }
        else{
            temp.next=list2;
            temp=temp.next;
        }
        return head.next;
    }
}