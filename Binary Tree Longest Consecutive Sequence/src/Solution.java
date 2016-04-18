/**
 * Created by Administrator on 2016/4/1.
 */
public class Solution {
    public int longestConsecutive(TreeNode root) {
        int result=0;
        helper(root,result,root,1)  ;
        return result;
    }

    private void helper(TreeNode root,int result,TreeNode pre, int current){
        result=Math.max(result,current);
        if(root==null) return;
        if(root.left==null&&root.right==null) return;
        if(root.val-root.left.val==-1){
            helper(root.left,result,root,current+1);
        }
        else helper(root.left,result,root,1);
        if(root.val-root.right.val==-1){
            helper(root.right,result,root,current+1);
        }
        else helper(root.right,result,root,1);

    }
}