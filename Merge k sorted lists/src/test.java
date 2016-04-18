/**
 * Created by tangni on 3/15/16.
 */
public class test {
    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode[] listnode=new ListNode[3];
        ListNode head=new ListNode(0);
        ListNode two=new ListNode(1);
        ListNode three=new ListNode(3);
        head.next=two;
        two.next=three;
        ListNode head2=new ListNode(2);
        head2.next= new ListNode(5);
        ListNode head3=new ListNode(4);
        head3.next= new ListNode(6);
        listnode[0]=head;
        listnode[1]=head2;
        listnode[2]=head3;

        solution.mergeKLists(listnode);
    }
}
