import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangni on 2/21/16.
 */
public class test {
    public static void main(String[] args) {
        List<Integer> v1=new ArrayList<Integer>();
        v1.add(1);
        List<Integer> v2=new ArrayList<Integer>();
        ZigzagIterator i = new ZigzagIterator(v1, v2);
        int[] v=new int[1];
        int n=0;
        while(i.hasNext()) {
            v[n]=i.next();
            n=n+1;
        }

    }
}
