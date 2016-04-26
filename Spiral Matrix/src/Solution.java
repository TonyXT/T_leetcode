import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tony on 2016/4/25.
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<Integer>();
        if(matrix.length==0) return result;
        int width=matrix.length;
        int length=matrix[0].length;
        helper(0,0,length-1,width-1,result,matrix);
        return result;
    }

    private void helper(int x, int y, int length, int width, List<Integer> result,int[][]matrix){
        if(length<0||width<0||x>width||y>length) return;
        for(int i=x;i<=length;i++){
            result.add(matrix[y][i]);
        }
        for(int i=y+1;i<width;i++){
            result.add(matrix[i][length]);
        }
        if(width!=y){
            for (int i = length; i >= x; i--) {
                result.add(matrix[width][i]);
            }
        }
        if(!(x==length)){
           for(int i=width-1;i>y;i--){
            result.add(matrix[i][x]);
           }
        }
        helper(x+1,y+1,length-1,width-1,result,matrix);
    }
}