import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangni on 2/9/16.
 */
public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list=new ArrayList<String>();
        for(int i=1;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=s.charAt(i-1);
            if(c1=='+'&&c2=='+'){
                if(i-1==0) {
                    list.add("--"+s.substring(2,s.length()));
                }
                else if(i>1){
                    list.add(s.substring(0,i-1)+"--"+s.substring(i+1,s.length()));
                }
            }
        }
        return list;
    }
}