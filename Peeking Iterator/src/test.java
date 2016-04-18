import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/4/15.
 */
public class test {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator=list.iterator();
        PeekingIterator PI=new PeekingIterator(iterator);
        System.out.print(PI.peek());
        System.out.print(PI.next());
        System.out.print(PI.peek());
    }
}
