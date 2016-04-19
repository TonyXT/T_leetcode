/**
 * Created by Tony on 2016/4/19.
 */
public class test {
    public static void main(String[] args) {
        ListNode a =new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        a.next=b;
        b.next=c;
        ListNode d=new ListNode(9);
        ListNode e=new ListNode(7);
        ListNode f=new ListNode(6);
        d.next=e;
        e.next=f;
        Solution solution=new Solution();
        solution.addTwoNumbers(a,e);
    }
}
