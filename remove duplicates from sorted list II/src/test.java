/**
 * Created by tangni on 3/13/16.
 */
public class test {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode one=new ListNode(1);
        head.next=one;
        Solution solution=new Solution();
        solution.deleteDuplicates(head);
    }
}
