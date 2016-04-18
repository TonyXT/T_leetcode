/**
 * Created by Administrator on 2016/1/17.
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddhead=head;
        ListNode odd=oddhead;
        ListNode evenhead=head.next;
        ListNode even=evenhead;

        while(oddhead.next!=null&&oddhead!=null&&evenhead!=null){
            if(evenhead!=null&&evenhead.next!=null){
                oddhead.next=evenhead.next;
                oddhead=oddhead.next;
                evenhead.next=oddhead.next;
                evenhead=evenhead.next;
            }
           else break;
        }
        oddhead.next=even;
        return odd;
    }
}
