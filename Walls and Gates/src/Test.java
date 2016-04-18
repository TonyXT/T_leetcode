/**
 * Created by tangni on 3/8/16.
 */
public class Test {
    public static void main(String[] args) {
        int[][] rooms={{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
        Solution solution=new Solution();
        solution.wallsAndGates(rooms);
    }
}
