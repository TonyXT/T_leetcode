/**
 * Created by Administrator on 2016/4/10.
 */
public class tesy {
    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode one=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode two2=new ListNode(2);

        one.next=two;
        two.next=two2;
        solution.removeElements(one,2);
    }
}
