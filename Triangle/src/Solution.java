import java.util.List;

/**
 * Created by Administrator on 2016/2/24.
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int result=helper(0,0,triangle);
        return result;
    }
    public int helper(int x, int y,List<List<Integer>> triangle ){
        int size=triangle.size();
        int[][] f=new int[size][size];
        for(int i=0;i<size;i++){
            f[size-1][i]=triangle.get(size-1).get(i);
        }
        for(int i=size-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                f[i][j]=Math.min(f[i+1][j],f[i+1][j+1])+triangle.get(i).get(j);
            }
        }
        return f[x][y];
    }
}