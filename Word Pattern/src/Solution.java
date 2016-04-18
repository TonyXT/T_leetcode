import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangni on 2/26/16.
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words=str.split(" ");
        Map<String,Character> map=new HashMap<String,Character>();
        if(words.length!=pattern.length()) return false;
        else{
            for(int i=0;i<words.length;i++){
                if(map.containsKey(words[i])){
                    Character c=map.get(words[i]);
                    if(!c.equals(pattern.charAt(i))) return false;
                }
                else {
                    if (map.containsValue(pattern.charAt(i))) return false;
                    map.put(words[i], pattern.charAt(i));
                }
            }
        }
        return true;
    }
}

