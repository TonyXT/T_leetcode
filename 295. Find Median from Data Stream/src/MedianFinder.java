import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by Tony on 2016/5/2.
 */
class MedianFinder {
    PriorityQueue<Integer> min = null;
    PriorityQueue<Integer> max = null;
    int len = 0;

    public MedianFinder(){
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Collections.reverseOrder());
    }

    //Understanding is we will be maintain 2 heaps max and min. The max heap will store the smaller half
    //and the min heap will store the larger half of the incoming numbers. Basically we are trying to mimic a
    //balanced tree with this model of representation, which means the max heap at the most can have only one extra
    //element than the min heap. We need to maintain the ordering that the root of the max heap < root of min heap

    // Adds a number into the data structure.
    public void addNum(int num) {
        //if the number of elements is even then we need to add the new element to the max heap
        if(len%2==0){
            max.offer(num);
        }else{
            //if the number of elements is odd then we need to add the new element to the maxheap
            //then transfer the root of the max heap to the min heap
            max.offer(num);
            min.offer(max.poll());
        }

        //increment the size
        len++;

        //if the root of max heap > root of min heap, then it conficts our order rule
        //so we shift the max heap's root to min heap and add the minimum element of our
        //min heap to max heap
        if(len > 1 && max.peek() > min.peek()){
            min.offer(max.poll());
            max.offer(min.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        return (len%2==0)?((double)((max.peek()+min.peek())/2.0)):((double)max.peek());
    }
}