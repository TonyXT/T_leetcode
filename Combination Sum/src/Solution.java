import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tangni on 2/15/16.
 */


public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        traverse(candidates,target,0,new ArrayList<Integer>(),list);
        Arrays.sort(candidates);
        return list;
    }
    private void traverse(int[] candidates, int target,int start,ArrayList<Integer> temp,List<List<Integer>> list){
        int i;
        for(i=start;i<candidates.length;i++){
            if(target-candidates[i]>0){
                temp.add(candidates[i]);
                traverse(candidates,target-candidates[i],i,temp,list);
                temp.remove(temp.size()-1);
            }
            else if(target==candidates[i]){
                temp.add(candidates[i]);
                list.add(new ArrayList<Integer>(temp));
                temp.remove(temp.size()-1);
            }
        }
    }
}