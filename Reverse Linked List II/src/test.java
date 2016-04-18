/**
 * Created by tangni on 3/13/16.
 */
public class test {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(3);
        ListNode four=new ListNode(4);
        ListNode five=new ListNode(5);
        head.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=null;
        Solution solution=new Solution();
        solution.reverseBetween(head,2,5);
    }
}
