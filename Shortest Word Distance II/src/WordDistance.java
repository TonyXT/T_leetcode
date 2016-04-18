import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/2/14.
 */
public class WordDistance {
    Map<String, ArrayList<Integer>> hm = new HashMap<String, ArrayList<Integer>>();

    public WordDistance(String[] words) {

        for (int i = 0; i < words.length; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            if (hm.containsKey(words[i])) list = hm.get(words[i]);
            list.add(i);
            hm.put(words[i], list);
        }
    }

    public int shortest(String word1, String word2) {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list1=hm.get(word1);
        list2=hm.get(word2);
        int sdistance=Integer.MAX_VALUE;
        for (Integer aList1 : list1) {
            for (Integer aList2 : list2) {
                int distance = Math.abs(aList1 - aList2);
                sdistance = Math.min(distance, sdistance);
            }
        }
        return sdistance;
    }
}
