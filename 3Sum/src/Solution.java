import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tangni on 2/20/16.
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int twosum=-nums[i];
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
                if(nums[low]+nums[high]==twosum){
                    List<Integer> list=new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    result.add(list);
                    while(high>low&&nums[low]==nums[low+1]) low++;
                    while(high>low&&nums[high]==nums[high-1]) high--;
                    low++;
                    high--;
                }
                else if(nums[low]+nums[high]>twosum){
                    high--;
                }
                else if(nums[low]+nums[high]<twosum){
                    low++;
                }
            }
        }
        return result;
    }
}