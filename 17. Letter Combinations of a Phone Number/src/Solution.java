import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tony on 2016/5/12.
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<String>();
        if(digits.contains("1")) return result;
        StringBuilder sb=new StringBuilder("");
        helper(result,sb,digits);
        return result;
    }
    private void helper(List<String> result, StringBuilder sb,String digits){
        if(digits.length()==0) return;
        char c=digits.charAt(0);
        String subdigits=digits.substring(1,digits.length());
        int length;
        if(c=='9'||c=='7') length=4;
        else length=3;
        for(int i=0;i<length;i++){
            StringBuilder s=new StringBuilder(sb);
            int num=(int)Character.getNumericValue(c);
            char a;
            if(num<=7) a=(char)(97+(num-2)*3+i);
            else  a=(char)(97+(num-2)*3+i+1);
            s.append(a);
            if(digits.length()==1) result.add(s.toString());
            helper(result,s,subdigits);
        }

    }
}