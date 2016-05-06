/**
 * Created by Tony on 2016/4/30.
 */
public class Solution {
    public int findlongestsubarray(int[] arr) {
//        int len=1;
//        int max=0;
//        for(int i=1;i<nums.length-1;i++){
//            if(nums[i]==nums[i-1]+1){
//                len++;
//                max=Math.max(len,max);
//            }
//            else {
//                len=1;
//                max=Math.max(len,max);
//            }
//        }
//        return max;
//    }
        if (arr.length < 2)
            return arr.length;

        int dp = 1;
        int largest = 0;

        for (int i = arr.length - 2; i > 0; i--) {
            int len = 1;
            if (arr[i] == arr[i + 1] - 1) {
                len += dp;
                largest = Math.max(largest, len);
                dp = len;
            } else {
                dp = len;
                largest = Math.max(largest, len);
            }
        }
        return largest;
    }
}