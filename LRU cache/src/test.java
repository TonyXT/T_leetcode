import com.sun.glass.ui.SystemClipboard;

/**
 * Created by tangni on 3/28/16.
 */
public class test {
    public static void main(String[] args) {
        LRUCache lc=new LRUCache(1);
        lc.set(2,1);
        System.out.print(lc.get(2));
        lc.set(3,2);
        System.out.print(lc.get(2));
//        System.out.print(lc.get(3));
    }
}
