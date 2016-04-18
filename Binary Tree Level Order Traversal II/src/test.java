import java.util.List;

/**
 * Created by Administrator on 2016/1/25.
 */
public class test {
    public static void main(String args[]){
        Solution solution=new Solution();
        TreeNode root=new TreeNode(3);
        TreeNode nine=new TreeNode(9);
        TreeNode twenty=new TreeNode(20);
        TreeNode five=new TreeNode(5);
        TreeNode seven=new TreeNode(7);
        root.left=nine;
        root.right=twenty;
        nine.left=null;
        nine.right=null;
        twenty.right=seven;
        twenty.left=five;
        five.left=null;
        five.right=null;
        seven.left=null;
        seven.right=null;
        List<List<Integer>>ls=solution.levelOrderBottom(root);

    }
}
