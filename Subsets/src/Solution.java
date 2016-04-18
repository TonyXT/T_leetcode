import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangni on 3/18/16.
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        helper(nums,list,result,0);
        return result;
    }
    private void helper(int[] nums,List<Integer> list, List<List<Integer>> result,int start){
        result.add(new ArrayList(list));
            for(int i=start;i<nums.length;i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            start++;
            helper(nums,list,result,start);
            list.remove(list.size()-1);
        }
    }
}