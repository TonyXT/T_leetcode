/**
 * Created by Administrator on 2015/6/2.
 */
public class TestMatch {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.initTree();
        System.out.println(tree.length(tree.root));
    }
}
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headFollow = head;
        ListNode start = head;
        for(int i = 1; i < n; i++)
            head = head.next;
        if(head.next == null)
            return headFollow.next;
        while(head.next.next != null) {
            head = head.next;
            headFollow = headFollow.next;
        }
        headFollow.next = headFollow.next.next;
        return start;
    }