/**
 * Created by Tony on 2016/5/2.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        TreeNode one=new TreeNode(1);
        TreeNode three=new TreeNode(3);
        TreeNode four=new TreeNode(4);
        root.left=one;
        root.right=three;
        one.right=four;
        Solution solution=new Solution();
        System.out.print(solution.rob(root));
    }
}
