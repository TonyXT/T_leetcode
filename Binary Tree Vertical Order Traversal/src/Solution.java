import java.util.*;

/**
 * Created by tangni on 3/19/16.
 */
public class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Queue<Integer> col=new LinkedList<Integer>();
        Queue<TreeNode> nodes=new LinkedList<TreeNode>();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

        if(root==null) return result;
        nodes.add(root);
        col.add(0);


        int max=0;
        int min=0;
        while(!nodes.isEmpty()){
            TreeNode node=nodes.poll();
            int ncol=col.poll();

            if(!map.containsKey(ncol)) map.put(ncol,new ArrayList<Integer>());
            map.get(ncol).add(node.val);


            if(node.left!=null){
                nodes.add(node.left);
                col.add(ncol-1);
                if(ncol<=min) min=ncol;
            }
            if(node.right!=null){
                nodes.add(node.right);
                col.add(ncol+1);
                if(ncol>=max) max=ncol;
            }
        }

        for(int i=min;i<max;i++){
            result.add(map.get(i));
        }
        return result;
    }
}