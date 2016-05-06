/**
 * Created by Tony on 2016/4/28.
 */
public class test {
    public static void main(String[] args) {
        int[][] nums={{3, 0, 1, 4, 2},{5, 6, 3, 2, 1},{1, 2, 0, 1, 5},{4, 1, 0, 1, 7},{1, 0, 3, 0, 5}};
        NumMatrix numMatrix=new NumMatrix(nums);
        numMatrix.sumRegion(2,1,4,3);
    }
}
