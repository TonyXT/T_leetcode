import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangni on 2/15/16.
 */
//public class Solution {
//    public List<List<Integer>> getFactors(int n) {
//        List<List<Integer>> list = new ArrayList<>();
//
//        list = perform(n, list, new ArrayList<Integer>());
//        return list;
//    }
//
//    private List<List<Integer>> perform(int n, List<List<Integer>> list, List<Integer> l){
//        for(int i=2;i<n;i++){
//            if(n%i==0 && i<=n/i && (l.size()==0 || l.get(l.size()-1) <= i)){
//                List<Integer> temp  = new ArrayList<Integer>(l);
//                temp.add(i);
//                list = perform(n/i, list, temp);
//                temp.add(n/i);
//                list.add(temp);
//            }
//        }
//        return list;
//    }
//}
public class Solution {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        traverse(n,result,new ArrayList());
        return result;
    }

    public void traverse(int n,List<List<Integer>> result,List<Integer> temp){
        for(int i=2;i<n;i++){
            if(n%i==0 && i<=n/i) {
                List<Integer> temp1  = new ArrayList<Integer>(temp);
                temp1.add(i);
                traverse(n/i,result,temp1);
                temp1.add(n/i);
                result.add(temp1);
            }
        }
    }
}