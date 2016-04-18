import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by tangni on 3/10/16.
 */
public class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        HashSet<Integer> hs=new HashSet<>();
        // HashMap<Integer,String> hm2=new HashMap<Integer,Character>();
        for(int i=0;i<secret.length();i++){
            hm.put(i,"T"+secret.charAt(i));
        }
        // for(int j=0;j<guess.length();j++){
        //     hm2.put(j,"T"+guess.charAt(j));
        // }
        int bull=0;
        int cow=0;

        for(int i=0;i<guess.length();i++){
            char c=guess.charAt(i);
            if(("T"+c).equals(hm.get(i))||("F"+c).equals(hm.get(i))) {
                bull++;
                hm.remove(i);
                hs.add(i);
            }

        }
        for(int k=0;k<guess.length();k++){
            char c=guess.charAt(k);
            if(hs.contains(k)) continue;
            else if(hm.containsValue("T"+c)){
                for(int p=0;p<guess.length();p++){
                    if(hs.contains(p)) continue;
                    if(hm.get(p).equals("T"+c)){
                        hm.put(p,"F"+c);
                        break;
                    }
                }
                cow++;
            }
        }

        return bull+"A"+cow+"B";
    }
}