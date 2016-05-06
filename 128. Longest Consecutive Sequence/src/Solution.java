import java.util.HashMap;

/**
 * Created by Tony on 2016/4/26.
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(Integer num:nums){
            map.put(num,1);
        }

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int length=1;
            if(!map.containsKey(num)) continue;
            int k=num-1;
            while(map.containsKey(k)){
                map.remove(k);
                length++;
                k=k-1;
            }
            int j=num+1;
            while(map.containsKey(j)){
                map.remove(j);
                length++;
                j=j+1;
            }
            max=Math.max(max,length);
        }
        return max;
    }
}