import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangni on 3/10/16.
 */
public class test {
    public static void main(String[] args) {
        List<List<Integer>> vec2d=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        List<Integer> b=new ArrayList<>();
//        b.add(3);
//        List<Integer> c=new ArrayList<>();
//        c.add(4);
//        c.add(5);
//        c.add(6);
//        vec2d.add(a);
//        vec2d.add(b);
//        vec2d.add(c);
        Vector2D i = new Vector2D(vec2d);
        int[] result=new int[6];
        int n=0;
        while(i.hasNext()){
            result[n]=i.next();
            n++;
        }
    }
}
