import java.util.Stack;

/**
 * Created by Administrator on 2016/4/6.
 */
public class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0 || s == null) return true;
        Stack<Character> stack = new Stack<Character>();
        char c = ' ';
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
              stack.push(c);
           }
            else {
                if(c==')'){
                   if(stack.isEmpty()||stack.pop()!='(') return false;
                }
                else if(c==']'){
                    if(stack.isEmpty()||stack.pop()!='[') return false;
                }
                else if (c=='}'){
                    if(stack.isEmpty()||stack.pop()!='{') return false;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}