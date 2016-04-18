import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tangni on 1/28/16.
 */
public class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        List<Integer>  list=new ArrayList<Integer>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1)
            {
                list.add(nums[i]);
                break;
            }
            if(nums[i]==nums[i+1]) {
                i=i+1;
            }
            else{
                list.add(nums[i]);
                if(list.size()==2) {
                   for(int j=0;j<list.size();j++){
                       result[j]=list.get(j);
                   }
                    return result;
                }
            }
        }
        for(int j=0;j<list.size();j++){
            result[j]=list.get(j);
        }
        return result;
    }
}
