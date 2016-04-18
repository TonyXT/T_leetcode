/**
 * Created by Administrator on 2016/2/27.
 */
public class test {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        TreeNode left1=new TreeNode(4);
        TreeNode right1=new TreeNode(8);
        TreeNode left2=new TreeNode(11);
        TreeNode left22=new TreeNode(13);
        TreeNode right2=new TreeNode(4);
        TreeNode left3=new TreeNode(7);
        TreeNode right3=new TreeNode(2);
        TreeNode right33=new TreeNode(1);

        root.left=left1;
        root.right=right1;
        left1.left=left2;
        left2.left=left3;
        left2.right=right3;
        right1.left=left22;
        right1.right=right2;
        right2.right=right33;

        Solution solution=new Solution();
        solution.hasPathSum(root,23);
    }
}
