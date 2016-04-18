import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/25.
 */
public class test {
    public static void main(String[] args){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(3);
        ListNode node3=new ListNode(5);
        ListNode onode1=new ListNode(2);
        ListNode onode2=new ListNode(4);
        ListNode onode3=new ListNode(5);

        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        onode1.next=onode2;
        onode2.next=onode3;
        onode3.next=null;
        Solution solution=new Solution();
        ListNode ln=solution.mergeTwoLists(node1,onode1);

    }
}
