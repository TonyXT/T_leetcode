import java.util.*;

/**
 * Created by Administrator on 2016/4/6.
 */
//public class ValidWordAbbr {
//    private HashMap<String,String> hm;
//    public ValidWordAbbr(String[] dictionary) {
//        hm = new HashMap<String, String>();
//        for(String s:dictionary){
//             hm.put(s,getAbbr(s));
//         }
//    }
//
//    public boolean isUnique(String word) {
//        String abbr=getAbbr(word);
//        if(hm.containsKey(word)){
//            hm.remove(word);
//        }
//        if(hm.containsValue(abbr)){
//            hm.put(word,getAbbr(word));
//            return false;
//        }
//        return true;
//    }
//
//    private String getAbbr(String s){
//        if(s.length()<=2) return s;
//        return s.charAt(0)+Integer.toString(s.length()-2)+s.charAt(s.length()-1);
//    }
//}
 public class ValidWordAbbr {
    HashMap<String, String> map;

    public ValidWordAbbr(String[] dictionary) {
        map = new HashMap<String, String>();
        for (String str : dictionary) {
            String key = getKey(str);
            // If there is more than one string belong to the same key
            // then the key will be invalid, we set the value to ""
            if (map.containsKey(key)) {
                if (!map.get(key).equals(str)) {
                    map.put(key, "");
                }
            } else {
                map.put(key, str);
            }
        }


    }


    public boolean isUnique(String word) {
        return !map.containsKey(getKey(word)) || map.get(getKey(word)).equals(word);
    }

    String getKey(String str) {
        if (str.length() <= 2) return str;
        return str.charAt(0) + Integer.toString(str.length() - 2) + str.charAt(str.length() - 1);
    }
}