/**
 * Created by tangni on 2/19/16.
 */
public class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int row1=A.length;
        int common=A[0].length;
        int col2=B[0].length;
        int[][] result=new int[row1][col2];
        for(int k=0;k<row1;k++){
            for(int j=0;j<col2;j++){
                int sum=0;
                for(int i=0;i<common;i++){
                    sum+=A[k][i]*B[i][j];
                }
                result[k][j]=sum;
            }
        }
        return result;
    }
}