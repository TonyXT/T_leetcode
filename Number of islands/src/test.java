/**
 * Created by Administrator on 2016/4/9.
 */
public class test {
    public static void main(String[] args) {
        char[][] matrix={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        Solution solution=new Solution();
        System.out.print(solution.numIslands(matrix));
    }
}
