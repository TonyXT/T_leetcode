import java.util.ArrayList;

/**
 * Created by tangni on 2/10/16.
 */
public class Solution {
    public boolean canWin(String s) {
        ArrayList<String> list=new ArrayList<String>();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)=='+'&& s.charAt(i)=='+'){
                if(i==1) list.add("--"+s.substring(i+1,s.length()));
                else list.add(s.substring(0,i-1)+"--"+s.substring(i+1,s.length()));
            }
        }
        return judge(list);
    }
    public boolean judge(ArrayList<String> list){
        for (String f : list) {
            boolean result = true;
            for (int j = 1; j < f.length(); j++) {
                if (f.charAt(j - 1) == '+' && f.charAt(j) == '+') result = false;
            }
            if (result) return true;
        }
        return false;
    }

}