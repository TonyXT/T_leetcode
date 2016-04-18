import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by tangni on 3/15/16.
 */
public class Solution {
    private Comparator<ListNode> ListNodeComparator=new Comparator<ListNode>() {
           public int compare(ListNode left,ListNode right){
               if(left==null) return -1;
               else if(right==null) return -1;
               return left.val-right.val;
           }
    };



    public ListNode mergeKLists(ListNode[] lists){
       if(lists==null||lists.length==0) return null;
        Queue<ListNode> heap= new PriorityQueue<ListNode>(lists.length,ListNodeComparator);
        for (ListNode list : lists) {
            if (list != null) heap.add(list);
        }

        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(!heap.isEmpty()){
            ListNode head=heap.poll();
            if(head.next!=null) heap.add(head.next);
            tail.next=head;
            tail=tail.next;
        }
       return dummy.next;
    }
}
