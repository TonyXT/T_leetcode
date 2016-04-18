import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by tangni on 3/10/16.
 */
public class Vector2D {
    Queue<Iterator<Integer>> q=new LinkedList<>();
    Iterator<Integer> current=null;
    public Vector2D(List<List<Integer>> vec2d) {
        for(int i=0;i<vec2d.size();i++){
            q.offer(vec2d.get(i).iterator());
        }
        current=q.poll();
    }

    public int next() {
        return current.next();
    }

    public boolean hasNext() {
        if(current==null) return false;
        while(!current.hasNext()){
            if(q.isEmpty()) return false;
            else current=q.poll();
        }
        return true;
    }
}