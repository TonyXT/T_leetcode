import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/24.
 */
public class test {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list1.add(1);
        list2.add(2);
        list2.add(3);
        list.add(list1);
        list.add(list2);
        Solution solution=new Solution();
        solution.minimumTotal(list);
    }



}
