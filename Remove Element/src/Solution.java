import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2016/1/17.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            hm.put(i,nums[i]);
        }
        Iterator<Map.Entry<Integer,Integer>> it = hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry=it.next();
            Integer key=entry.getKey();
            Integer hmvalue=entry.getValue();
            if(hmvalue==val){
                it.remove();
            }
        }
        return hm.size();
    }
}