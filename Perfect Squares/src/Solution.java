import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/11.
 */
public class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> numSquares(int n) {
        list=new ArrayList<List<Integer>>();
        List<Integer> list2=new ArrayList<Integer>();
        helper(n,1,list,list2);
        return list;
    }
    private void helper(int n, int index, List<List<Integer>> l,List<Integer> l2){
        if(n==0) list.add(l2);
        int x=n-index*index;
        if(x<0) return;
        l2.add(index*index);
        helper(x,index+1,list,l2);
        l.remove(l.size()-1);
    }
}