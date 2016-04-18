import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/25.
 */
public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<List<Integer>> list2 = new ArrayList<List<Integer>>();
        if (root == null) return list;
        traversal(list, root, 1);
        for (int i = list.size()-1; i >= 0; i--){
            list2.add(list.get(i));
        }
        return list2;
    }

    private void traversal(List<List<Integer>> list, TreeNode node, int depth) {
        if (node == null) return;
        if (list.size() == depth-1) {
            List<Integer> l1 = new ArrayList<Integer>();
            l1.add(node.val);
            list.add(l1);
        }
        else if (list.size() >= depth){
            List<Integer> l2 = list.get(depth-1);
            l2.add(node.val);
        }
        traversal(list, node.left, depth + 1 );
        traversal(list, node.right, depth + 1 );
    }
}