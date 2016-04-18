import java.util.HashMap;

/**
 * Created by tangni on 2/19/16.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])) {
                int index=target-nums[i];
                int j=hm.get(index);
                result[0]= i;
                result[1]= j;
                return result;
            }
            else hm.put(target-nums[i],i);
        }
        return result;
    }
}