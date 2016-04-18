import java.util.Iterator;

/**
 * Created by Administrator on 2016/4/15.
 */
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextnum=null;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator=iterator;
        next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextnum;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer cache=nextnum;
        if(iterator.hasNext()){
            nextnum=iterator.next();
        }
        else nextnum=null;
        return cache ;
    }

    @Override
    public boolean hasNext() {
        return (nextnum!=null);
    }

    public  void remove(){

    }
}