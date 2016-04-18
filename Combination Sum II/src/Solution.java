import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/3/20.
 */
class Solution {
    List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(candidates.length==0) return result;
        List<Integer> list=new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(candidates,target,0,result,list);
        return result;

    }

    private void helper(int[] candidates, int target, int start, List<List<Integer>> result, List<Integer> list){
        if(target==0){
            result.add(new ArrayList<Integer>(list));
        }
        if(target<0) return;
        int pre=-1;
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]!=pre) {
                list.add(candidates[i]);
                helper(candidates, target - candidates[i], i + 1, result, list);
                pre=candidates[i];
                list.remove(list.size() - 1);
            }
        }
    }
}
