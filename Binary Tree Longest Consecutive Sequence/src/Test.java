/**
 * Created by Administrator on 2016/4/1.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        TreeNode right=new TreeNode(3);
        root.left=left;
        root.right=right;
        Solution solution=new Solution();
        System.out.print(solution.longestConsecutive(root));
    }
}
