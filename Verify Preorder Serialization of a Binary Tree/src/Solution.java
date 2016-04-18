import java.util.Stack;

/**
 * Created by Administrator on 2016/4/1.
 */

        // using a stack, scan left to right
        // case 1: we see a number, just push it to the stack
        // case 2: we see #, check if the top of stack is also #
        // if so, pop #, pop the number in a while loop, until top of stack is not #
        // if not, push it to stack
        // in the end, check if stack size is 1, and stack top is #
//        if (preorder == null) {
//            return false;
//        }
//        Stack<String> st = new Stack<String>();
//        String[] strs = preorder.split(",");
//        for (int pos = 0; pos < strs.length; pos++) {
//            String curr = strs[pos];
//            while (curr.equals("#") && !st.isEmpty() && st.peek().equals(curr)) {
//                st.pop();
//                if (st.isEmpty()) {
//                    return false;
//                }
//                st.pop();
//            }
//            st.push(curr);
//        }
//        return st.size() == 1 && st.peek().equals("#");
//    }
        public class Solution {
            public boolean isValidSerialization(String preorder) {
                if (preorder == null) {
                    return false;
                }
                Stack stack=new Stack<String>();
                String[] pre=preorder.split(",");
                for(int i=0;i<pre.length;i++){
                    String node=pre[i];
                    while(!stack.isEmpty()&&node.equals("#")&&node.equals(stack.peek())){
                        stack.pop();
                        if (stack.isEmpty()) {
                            return false;
                        }
                        stack.pop();
                    }
                    stack.push(node);
                }
                if(stack.size()!=1||stack.peek().equals("#")) return false;
                return true;
            }
        }
