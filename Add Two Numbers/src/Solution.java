/**
 * Created by Tony on 2016/4/19.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode dummyNode=new ListNode(0);
        ListNode head=new ListNode(0);
        head.next=dummyNode;
        int pre=0;
        while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val;
            ListNode listnode=new ListNode((sum+pre)%10);
            dummyNode.next=listnode;
            dummyNode=dummyNode.next;
            l1=l1.next;
            l2=l2.next;
            pre=(sum+pre)/10;
        }
        ListNode rest=(l1==null?l2:l1);
        while(rest!=null){
            int val=rest.val;
            ListNode node=new ListNode((val+pre)%10);
            pre=(val+pre)/10;
            dummyNode.next=node;
            dummyNode=dummyNode.next;
            rest=rest.next;
        }
        if(pre!=0){
            ListNode last=new ListNode(pre);
            dummyNode.next=last;
        }
        return head.next.next;
    }
}