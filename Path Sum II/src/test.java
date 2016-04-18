/**
 * Created by tangni on 3/4/16.
 */
public class test {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        root.left=left;
        int sum=3;
        Solution solution=new Solution();
        solution.pathSum(root,sum);
    }
}
