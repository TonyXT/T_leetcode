import java.util.Arrays;

/**
 * Created by Administrator on 2016/1/24.
 */
public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            if(i+1>=nums.length) return nums[i];
            if(nums[i]==nums[i+1]) i=i+1;
            else return nums[i];
        }
        return 0;
    }
}