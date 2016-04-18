/**
 * Created by tangni on 3/13/16.
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null||n<m) return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        head=dummy;

        for(int i=1;i<m;i++){
            if(head==null) return null;
            head=head.next;
        }

        ListNode prev=head;
        ListNode mnode=head.next;
        ListNode nnode=mnode;
        ListNode post=nnode.next;

        for(int i=m;i<n;i++){
            if(post==null){
                return null;
            }
            ListNode temp=post.next;
            post.next=nnode;
            nnode=post;
            post=temp;
        }
        prev.next=nnode;
        mnode.next=post;
        return dummy.next;
    }
}