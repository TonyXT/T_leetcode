/**
 * Created by Administrator on 2016/4/10.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode DummyNode=new ListNode(0);
        DummyNode.next=head;
        ListNode result=DummyNode;
        while(DummyNode!=null){
            ListNode next=DummyNode.next;
            while(next!=null&&next.val==val){

                    next=next.next;

            }
            DummyNode.next=next;
            DummyNode=DummyNode.next;
        }
        return result.next;
    }
}