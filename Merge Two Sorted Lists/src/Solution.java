/**
 * Created by Administrator on 2016/1/25.
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null &&l1==null) return null;
        if(l1==null&&l2!=null) return l2;
        if(l1!=null&&l2==null) return l1;
        ListNode start;
        if(l1.val<=l2.val){
            start=l1;
            l1=l1.next;
        }else{
            start=l2;
            l2=l2.next;
        }
        ListNode begin=start;
        while(l1!=null||l2!=null){
            if(l1==null&&l2!=null){
                start.next=l2;
                return begin;
            }
            else if(l1!=null&&l2==null){
                start.next=l1;
                return begin;
            }
            if(l1.val>=l2.val){
                start.next=l2;
                l2=l2.next;
                start=start.next;
            }else{
                start.next=l1;
                l1=l1.next;
                start=start.next;
            }
        }
        return begin;
    }
}