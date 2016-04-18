import java.util.ArrayList;
import java.util.List;

public class ZigzagIterator {
    boolean flag1=false;
    boolean flag2=false;
    ArrayList<Integer> list1;
    ArrayList<Integer> list2;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        list1=new ArrayList<Integer>(v1);
        list2=new ArrayList<Integer>(v2);
    }

    public int next() {
        int result=0;
        if(list1.isEmpty()&&!list2.isEmpty()){
            result=list2.get(0);
            list2.remove(0);
            return result;
        }
        if(!list1.isEmpty()&&list2.isEmpty()){
            result=list1.get(0);
            list1.remove(0);
            return result;
        }
        if(!list1.isEmpty()&&!list2.isEmpty()) {
           if (!flag1) {
               flag1 = true;
               flag2 = false;
               result = list1.get(0);
               list1.remove(0);
           } else if (!flag2) {
               flag2 = true;
               flag1 = false;
               result = list2.get(0);
               list2.remove(0);
           }
       }
        return result;
    }

    public boolean hasNext() {
        if(list1.isEmpty()&&list2.isEmpty()){
            return false;
        }
        return true;
    }
}