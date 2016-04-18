import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/11.
 */
public class Solution {
    List<String> list=new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        int processedWords= (1 << 'c' - 'a');
        String binStr=Integer.toBinaryString(processedWords);
        String sb="";
        helper(0,0,sb,n,list);
        return list;
    }

    private void helper(int left,int right,String s,int n, List<String> l){
        if(right>left) return;
        if(right==n&&left==n) {
            list.add(s);
            return;
        }

        if(left<n) {
            String sb=s.concat("(");
            helper(left+1, right, sb, n, list);
        }
        if(left>n)return;
        if(right<n) {
            if (left > right) {
                String sb2=s.concat(")");
                helper(left, right+1, sb2, n, list);
            }
        }
        if(right>n) return;
    }
}