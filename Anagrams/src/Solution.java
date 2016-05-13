/**
 * Created by Tony on 2016/5/6.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

    public static void main(String[] args) throws java.lang.Exception {
        String[] strs = {"tea", "eta", "eat", "gab"};
        anagrams(strs);
    }

    public static List<String> anagrams(String[] strs) {
        ArrayList<String> result = new ArrayList<>();
        if (strs == null || strs.length == 0) return result;
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = String.valueOf(chars);
            if (!map.containsKey(sortedString)) {
                ArrayList<Integer> position = new ArrayList<>();
                position.add(i);
                map.put(sortedString, position);
            } else {
                ArrayList<Integer> position = map.get(sortedString);
                position.add(i);
                map.put(sortedString, position);
            }
        }

        for (ArrayList<Integer> position : map.values()) {
            result = new ArrayList<>();
            for (Integer i : position) {
                result.add(strs[i]);
            }
            System.out.print(result);
        }
        return result;
    }
}