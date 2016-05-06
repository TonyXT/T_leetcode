import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Tony on 2016/4/26.
 */
public class Solution {
    // public int[] maxSlidingWindow(int[] nums, int k) {
    //     Comparator cmp=new Comparator<Integer>(){
    //         public int compare(Integer n1,Integer n2){
    //             return (n2-n1);
    //         }
    //     };
    //     if(nums.length==0&&k==0) return new int[0];
    //     PriorityQueue<Integer> queue = new PriorityQueue<Integer>(cmp);
    //     int[] result=new int[nums.length-k+1];
    //     for(int i=0;i<=nums.length;i++){
    //         if(queue.size()==k){
    //             int max=queue.peek();
    //             result[i-k]=max;
    //             int first=nums[i-k];
    //             queue.remove(first);
    //         }
    //         if(queue.size()<k&&i<nums.length) queue.add(nums[i]);

    //     }
    //     return result;
    // }
    public int[] maxSlidingWindow(int[] a, int k) {
        if (a == null || k <= 0) return new int[0];
        int[] res = new int[a.length - k + 1];
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

        int index  = 0;
        for (int i = 0; i < a.length; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) // Ensure deque's size doesn't exceed k
                deque.poll();

            // Remove numbers smaller than a[i] from right(a[i-1]) to left, to make the first number in the deque the largest one in the window
            while (!deque.isEmpty() && a[deque.peekLast()] < a[i])
                deque.pollLast();

            deque.offer(i);// Offer the current index to the deque's tail

            if (i >= k - 1)// Starts recording when i is big enough to make the window has k elements
                res[index++] = a[deque.peek()];
        }
        return res;
    }
}