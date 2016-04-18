import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by tangni on 3/7/16.
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.size()>0){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(i==size-1) result.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
        }
        return result;
    }
}